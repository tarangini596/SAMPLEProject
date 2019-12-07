package com.eg.Exceptions;

public class UncheckedExceptions {
	static {
		System.out.println("In unchecked Exceptions  ---RUNTIME EXCEPTIONS");
		System.out.println("checking ArrayIndexOutOfBounce");
		
	}

	public static void main(String[] args) {

		int num[] = {1, 2, 3, 4};
	      System.out.println(num[5]);
	}

}
