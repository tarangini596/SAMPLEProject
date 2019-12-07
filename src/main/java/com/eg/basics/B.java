package com.eg.basics;

public class B extends A {
	

	B() {
//		super();
		System.out.println("constructor of B");
	}
	
	int a=10;

	@Override
	public void print() {
		System.out.println("B- print");
	}

	public void message() {
		System.out.println("B- messge");
		
	}
	
}
