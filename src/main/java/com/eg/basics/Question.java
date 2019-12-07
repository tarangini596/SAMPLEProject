package com.eg.basics;

public class Question {

	public static void main(String[] args) {

		//A is super class(parent) & B is subclass (child)
		A a=new B();
		a.print();
		a.display();
		System.out.println("A value : "+a.a);
		
//		a.message();
		
		/*B b =new B();
		b.message();*/
			
	}
}

