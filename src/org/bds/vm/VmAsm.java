package org.bds.vm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bds.lang.type.Type;
import org.bds.lang.type.TypeList;
import org.bds.lang.type.TypeMap;
import org.bds.lang.type.Types;
import org.bds.util.Gpr;

/**
 * Assembly compiler and debugger for BdsVm
 *
 * @author pcingola
 */
public class VmAsm {

	boolean verbose, debug;
	int lineNum;
	String file;
	BdsVm bdsvm;
	List<Integer> code;
	Map<String, Type> typeByName;

	public VmAsm(String file) {
		this.file = file;
	}

	/**
	 * Add instruction & param to code
	 */
	void addInstruction(OpCode opcode, String param) {
		code.add(opcode.ordinal());
		if (param != null) addParam(opcode, param);
	}

	/**
	 * Add param to code
	 * @param param
	 */
	void addParam(OpCode opcode, String param) {
		// We need to add 'param' to pool of constants and add a reference to it
		Object obj = parseConstant(opcode, param);
		int idx = bdsvm.addConstant(obj);
		code.add(idx);
	}

	public void addType(Type type) {
		if (debug) Gpr.debug("Adding type '" + type.toString() + "'");
		typeByName.put(type.toString(), type);
	}

	/**
	 * BdsCompiler a file
	 *
	 * Note: This object cannot be re-used. Create a new VmAsm
	 *       each time you compile
	 */
	public BdsVm compile() {
		if (bdsvm != null) throw new RuntimeException("Code already compiled!");

		// Initialize
		bdsvm = new BdsVm();
		code = new ArrayList<>();
		bdsvm.setDebug(debug);
		bdsvm.setVerbose(verbose);
		initTypes();

		// Read file and parse each line
		lineNum = 1;
		String str = Gpr.readFile(file);
		for (String line : str.split("\n")) {
			// Remove comments and labels
			line = removeComments(line);

			// Parse label, if any
			label(line);

			// Keep the rest of the line (no labels)
			line = stripLabel(line).trim();
			if (line.isEmpty()) continue;

			// Decode instruction
			OpCode opcode = opcode(line);
			String param = null;
			if (opcode.hasParam()) param = param(line);
			if (verbose) System.out.println("\t" + opcode + (param != null ? " " + param : ""));

			// Add instruction
			addInstruction(opcode, param);
			lineNum++;
		}

		bdsvm.setCode(code);
		if (debug) System.err.println("# Assembly: Start\n" + bdsvm.toAsm() + "\n# Assembly: End\n");
		return bdsvm;
	}

	Type getType(String typeName) {
		return typeByName.get(typeName);
	}

	/**
	 * Initialize types
	 */
	void initTypes() {
		typeByName = new HashMap<>();

		Type types[] = { Types.BOOL, Types.INT, Types.REAL, Types.STRING };

		// Add all basic list types
		for (Type te : types)
			addType(TypeList.get(te));

		// Add all basic map types
		for (Type tk : types)
			for (Type tv : types)
				addType(TypeMap.get(tk, tv));
	}

	/**
	 * Get a label from an input line, null if there are no labels
	 */
	void label(String line) {
		int idx = line.indexOf(':');
		if (idx < 0) return;

		String label = line.substring(0, idx).trim();

		if (label.indexOf('(') > 0 && label.indexOf(')') > 0) {
			bdsvm.addFunction(label, pc());
		} else {
			bdsvm.addLabel(label, pc());
		}

		if (verbose) System.out.println(label + ":");
	}

	/**
	 * Parse an opcode
	 */
	OpCode opcode(String line) {
		String s[] = line.split("\\s+");
		String op = s[0].toUpperCase();
		try {
			return OpCode.valueOf(op);
		} catch (Exception e) {
			throw new RuntimeException("Unknown opcode '" + op + "', file '" + file + "', line " + lineNum);
		}
	}

	/**
	 * Parse a parameter
	 */
	String param(String line) {
		String s[] = line.split("\\s+");
		return s.length > 1 ? s[1] : null;
	}

	/**
	 * Convert parameter string to appropriate constant type
	 */
	Object parseConstant(OpCode opcode, String param) {
		switch (opcode) {
		case CALL:
		case LOAD:
		case PUSHS:
		case STORE:
			return param; // Type is String

		case NEW:
			return getType(param);

		case PUSHB:
			return Gpr.parseBoolSafe(param);

		case PUSHI:
			return Gpr.parseLongSafe(param);

		case PUSHR:
			return Gpr.parseDoubleSafe(param);

		default:
			throw new RuntimeException("Unknown parameter type for opcode '" + opcode + "'");
		}
	}

	/**
	 * Current program counter
	 */
	int pc() {
		return code.size();
	}

	/**
	 * Remove comments
	 */
	String removeComments(String line) {
		int commentIdx = line.indexOf('#');
		return commentIdx >= 0 ? line.substring(0, commentIdx) : line;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	/**
	 * Remove any labels
	 */
	String stripLabel(String line) {
		int labelIdx = line.indexOf(':');
		return labelIdx >= 0 ? line.substring(labelIdx + 1) : line;
	}

}