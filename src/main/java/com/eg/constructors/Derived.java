package com.eg.constructors;

public class Derived extends ChainingConstructoreUsingSuper {

	Derived() {
		System.out.println("No-argument constructor " + "of derived");
	}

	Derived(String name) {
		super(name);
		System.out.println("Calling parameterized " + "constructor of derived");
	}

	public static void main(String args[]) {
		Derived obj = new Derived("test");
		
	}

}
