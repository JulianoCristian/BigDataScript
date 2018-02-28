package org.bds.lang.nativeFunctions;

import java.util.ArrayList;

import org.bds.lang.Parameters;
import org.bds.lang.type.Type;
import org.bds.lang.type.TypeList;
import org.bds.lang.type.Types;
import org.bds.run.BdsThread;

/**
 * Native function "range". Return a random list of int
 *
 * @author pcingola
 */
public class FunctionNativeRangeInt extends FunctionNative {

	public FunctionNativeRangeInt() {
		super();
	}

	@Override
	protected void initFunction() {
		functionName = "range";
		returnType = TypeList.get(Types.INT);

		String argNames[] = { "min", "max" };
		Type argTypes[] = { Types.INT, Types.INT };
		parameters = Parameters.get(argTypes, argNames);
		addNativeFunctionToScope();
	}

	@Override
	protected Object runFunctionNative(BdsThread bdsThread) {
		long min = bdsThread.getInt("min");
		long max = bdsThread.getInt("max");

		ArrayList<Long> list = new ArrayList<>();
		for (long i = min; i <= max; i++)
			list.add(i);

		return list;
	}
}
