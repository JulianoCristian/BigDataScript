package ca.mcgill.mcb.pcingola.bigDataScript.lang;

import org.antlr.v4.runtime.tree.ParseTree;

import ca.mcgill.mcb.pcingola.bigDataScript.compile.CompilerMessages;
import ca.mcgill.mcb.pcingola.bigDataScript.compile.CompilerMessage.MessageType;
import ca.mcgill.mcb.pcingola.bigDataScript.run.BigDataScriptThread;
import ca.mcgill.mcb.pcingola.bigDataScript.run.RunState;
import ca.mcgill.mcb.pcingola.bigDataScript.scope.Scope;

/**
 * A "continue" statement
 * 
 * @author pcingola
 */
public class Continue extends Statement {

	public Continue(BigDataScriptNode parent, ParseTree tree) {
		super(parent, tree);
	}

	@Override
	protected void parse(ParseTree tree) {
		// Nothing to do
	}

	/**
	 * Run the program
	 */
	@Override
	protected RunState runStep(BigDataScriptThread csThread) {
		return RunState.CONTINUE;
	}

	@Override
	protected void typeCheck(Scope scope, CompilerMessages compilerMessages) {
		if ((findParent(ForLoop.class, FunctionDeclaration.class) == null) && (findParent(While.class, FunctionDeclaration.class) == null)) compilerMessages.add(this, "break statement outside loop", MessageType.ERROR);
	}
}
