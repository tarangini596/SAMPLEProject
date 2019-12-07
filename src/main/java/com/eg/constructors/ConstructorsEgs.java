package com.eg.constructors;

public class ConstructorsEgs {

	String name;
	String lastname;

	public ConstructorsEgs() {
		this("TARA","Gondimalla");
		System.out.println("In the constructor");

	}

	public ConstructorsEgs(String name, String lastname) {
		System.out.println("In the parameterixes constructor");
		this.name = name;
		this.lastname = lastname;
	}
	

}
