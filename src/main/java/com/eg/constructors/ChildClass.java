package com.eg.constructors;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		ChildClass childClassObj = new ChildClass();
/*		childClassObj.Hello();
		childClassObj.HelloWorld();
		System.out.println(" name from super class " + childClassObj.name);*/

		System.out.println("calling AccessingSuperClass() :");
		childClassObj.AccessingSuperClass();
		
	}

	public ChildClass() {
/*		// added for the accessing of super-class methods
		super();
		// calling method of super-class (parent)
		Hello();
		HelloWorld();
		// getting the value from the super-class parent
		System.out.println("My name is " + name);*/
		System.out.println("In the child class constructor");
	}
	
	public void AccessingSuperClass() {
		System.out.println("in the accesing super class()");
		Hello();
	}

}
