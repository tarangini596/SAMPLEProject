package com.eg.Errors;

public class StackOverflowError {
	public static void test(int i) {
		// No correct as base condition leads to
		// non-stop recursion.
		if (i == 0)
			return;
		else {
			test(i++);
		}
	}
}
