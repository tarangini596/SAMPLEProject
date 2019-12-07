package com.eg.wrapper;

public class Unboxing {

	public static void main(String[] args) {

		
		Integer a=new Integer(2);
		int i=a.intValue(); // wrapper to primitive
		int j=a; // direct wrapper to primitive
		System.out.println(" "+ a+ " "+i+" "+j);
		
	}

}
