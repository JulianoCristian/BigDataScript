package ca.mcgill.mcb.pcingola.bigDataScript.run;

import java.util.Iterator;
import java.util.Stack;

import ca.mcgill.mcb.pcingola.bigDataScript.lang.BigDataScriptNode;
import ca.mcgill.mcb.pcingola.bigDataScript.serialize.BigDataScriptSerialize;
import ca.mcgill.mcb.pcingola.bigDataScript.serialize.BigDataScriptSerializer;
import ca.mcgill.mcb.pcingola.bigDataScript.util.Gpr;

/**
 * Program counter: A 'stack' of nodes that we are currently executing
 * 
 * @author pcingola
 */
public class ProgramCounter implements BigDataScriptSerialize, Iterable<Integer> {

	Stack<Integer> nodeIds;

	public ProgramCounter() {
		nodeIds = new Stack<Integer>();
	}

	public ProgramCounter(ProgramCounter pc) {
		nodeIds = new Stack<Integer>();
		nodeIds.addAll(pc.nodeIds);
	}

	boolean isEmpty() {
		return nodeIds.isEmpty();
	}

	@Override
	public Iterator<Integer> iterator() {
		return nodeIds.iterator();
	}

	/**
	 * Get node ID for index 'idx'
	 * @param idx
	 * @return
	 */
	public int nodeId(int idx) {
		return nodeIds.get(idx);
	}

	/**
	 * Add to program counter
	 * @param csnode
	 */
	public void pop(BigDataScriptNode csnode) {
		int nodeId = nodeIds.pop();

		// Sanity check
		if (nodeId != csnode.getId()) {
			Gpr.debug("Node ID does not math!" //
					+ "\n\tNode id    : " + nodeId //
					+ "\n\tCS_Node id : " + csnode.getId() //
			);
		}
	}

	/**
	 * Add to program counter
	 * @param csnode
	 */
	public void push(BigDataScriptNode csnode) {
		nodeIds.push(csnode.getId());
	}

	@Override
	public void serializeParse(BigDataScriptSerializer serializer) {
		for (int i = 1; i < serializer.getFields().length; i++)
			nodeIds.push((int) serializer.getNextFieldInt());
	}

	@Override
	public String serializeSave(BigDataScriptSerializer serializer) {
		StringBuilder out = new StringBuilder();
		out.append(getClass().getSimpleName() + "\t");

		for (int nn : nodeIds)
			out.append(nn + "\t");

		out.deleteCharAt(out.length() - 1); // Remove last tab
		out.append("\n");

		return out.toString();
	}

	public int size() {
		return nodeIds.size();
	}

	@Override
	public String toString() {
		StringBuilder out = new StringBuilder();
		for (int nn : nodeIds)
			out.append((out.length() > 0 ? " -> " : "") + nn);
		return out.toString();
	}
}
