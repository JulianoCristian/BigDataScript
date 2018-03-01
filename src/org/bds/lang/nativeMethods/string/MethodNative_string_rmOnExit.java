package org.bds.lang.nativeMethods.string;

import org.bds.lang.Parameters;
import org.bds.lang.nativeMethods.MethodNative;
import org.bds.lang.type.Type;
import org.bds.lang.type.Types;
import org.bds.run.BdsThread;

public class MethodNative_string_rmOnExit extends MethodNativeString {
	public MethodNative_string_rmOnExit() {
		super();
	}

	@Override
	protected void initMethod() {
		functionName = "rmOnExit";
		classType = Types.STRING;
		returnType = Types.VOID;

		String argNames[] = { "this" };
		Type argTypes[] = { Types.STRING };
		parameters = Parameters.get(argTypes, argNames);
		addNativeMethodToClassScope();
	}

	@Override
	protected Object runMethodNative(BdsThread bdsThread, Object objThis) {
		bdsThread.rmOnExit(objThis.toString());
		return objThis;
	}
}
