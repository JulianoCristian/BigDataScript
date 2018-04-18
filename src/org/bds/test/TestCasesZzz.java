package org.bds.test;

import org.bds.util.Gpr;
import org.junit.Test;

/**
 * Quick test cases when creating a new feature...
 *
 * @author pcingola
 *
 */
public class TestCasesZzz extends TestCasesBase {

	@Test
	public void test16() {
		Gpr.debug("Test");
		runAndCheck("test/run_16.bds", "ss", "onetwothree");
	}

	//	@Test
	//	public void test113_parallel_function_calls() {
	//		Gpr.debug("Test");
	//		String stdout = runAndReturnStdout("test/run_113.bds");
	//
	//		Set<String> linesPar = new HashSet<>();
	//		for (String line : stdout.split("\n")) {
	//			if (line.startsWith("Par:")) {
	//				if (linesPar.contains(line)) throw new RuntimeException("Line repeated (this should never happen): '" + line + "'");
	//				linesPar.add(line);
	//			}
	//		}
	//	}
	//
	//	@Test
	//	public void test114_parallel_function_task_calls() {
	//		Gpr.debug("Test");
	//		String stdout = runAndReturnStdout("test/run_114.bds");
	//
	//		Set<String> linesPar = new HashSet<>();
	//		for (String line : stdout.split("\n"))
	//			if (line.startsWith("TASK")) linesPar.add(line);
	//
	//		// Check
	//		Assert.assertTrue("There should be 5 tasks", linesPar.size() == 5);
	//	}
	//
	//	@Test
	//	public void test115_task_dependency_using_taskId() {
	//		Gpr.debug("Test");
	//		String stdout = runAndReturnStdout("test/run_115.bds");
	//		Assert.assertEquals("Hi 1\nBye 1\nHi 2\nBye 2\n", stdout);
	//	}
	//
	//	@Test
	//	public void test116_lineWrap_backslashId() {
	//		Gpr.debug("Test");
	//		String stdout = runAndReturnStdout("test/run_116.bds");
	//		Assert.assertEquals("hi bye\nThe answer\t\tis: 42", stdout);
	//	}
	//
	//	@Test
	//	public void test117_serial_parallel_tasks() {
	//		Gpr.debug("Test");
	//		String expectedStdout = "Iter 1, Task 1: End\n" //
	//				+ "Iter 1, Task 2: Start\n" //
	//				+ "Iter 1, Task 2: End\n" //
	//				+ "Iter 5, Task 1: End\n" //
	//				+ "Iter 5, Task 2: Start\n" //
	//				+ "Iter 5, Task 2: End\n" //
	//		;;
	//
	//		String stdout = runAndReturnStdout("test/run_117.bds");
	//
	//		if (stdout.indexOf(expectedStdout) < 0) {
	//			String msg = "Cannot find desired output:\n" //
	//					+ "---------- Expected output ----------\n" //
	//					+ expectedStdout //
	//					+ "-------------- STDOUT --------------\n" //
	//					+ stdout //
	//			;
	//			System.err.println(msg);
	//			throw new RuntimeException(msg);
	//		}
	//	}
	//
	//	@Test
	//	public void test118_dependency_using_path() {
	//		Gpr.debug("Test");
	//		runAndCheckExit("test/run_118.bds", 0);
	//	}

}
