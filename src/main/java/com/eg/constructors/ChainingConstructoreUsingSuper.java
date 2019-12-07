package com.eg.constructors;

public class ChainingConstructoreUsingSuper {

	String name;

	ChainingConstructoreUsingSuper() {
		this("");
		System.out.println("No-argument constructor of" + " base class");
	}

	ChainingConstructoreUsingSuper(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor" + " of base");
	}

}
