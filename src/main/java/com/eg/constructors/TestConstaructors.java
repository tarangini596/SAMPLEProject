package com.eg.constructors;

public class TestConstaructors {
	TestConstaructors() {
		System.out.println("default");
	}

	TestConstaructors(int x) {
		this();
		System.out.println(x);
	}

	TestConstaructors(int x, int y) {
		this(5);
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		new TestConstaructors(8, 10);
	}

}
