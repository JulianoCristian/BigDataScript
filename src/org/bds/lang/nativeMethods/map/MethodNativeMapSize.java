package org.bds.lang.nativeMethods.map;

import java.util.HashMap;

import org.bds.lang.Parameters;
import org.bds.lang.type.Type;
import org.bds.lang.type.TypeMap;
import org.bds.lang.type.Types;
import org.bds.run.BdsThread;

/**
 * Return a list of keys
 * 
 * @author pcingola
 */
public class MethodNativeMapSize extends MethodNativeMap {

	public MethodNativeMapSize(Type baseType) {
		super(baseType);
	}

	@Override
	protected void initMethod(Type baseType) {
		functionName = "size";
		classType = TypeMap.get(baseType);
		returnType = Types.INT;

		String argNames[] = { "this" };
		Type argTypes[] = { classType };
		parameters = Parameters.get(argTypes, argNames);

		addNativeMethodToClassScope();
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	protected Object runMethodNative(BdsThread csThread, Object objThis) {
		HashMap map = (HashMap) objThis;
		return (long) map.size();
	}
}
