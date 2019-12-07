package com.eg.Errors;

public class ErrorEg {
	static {
		System.out.println("In ErrorEg");
		System.out.println("calling StackOverFlowError class");
		System.out.println("calling OutOfMemoryError class");
	}

	public static void main(String[] args) {

		// stackoverflow Error
		StackOverflowError.test(5);
		// Out of Memory Error
		OutOFMemoryError.test(7);
	}
}
