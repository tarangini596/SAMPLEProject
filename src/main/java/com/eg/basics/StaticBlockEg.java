package com.eg.basics;

public class StaticBlockEg {
	
	//constructor 
	StaticBlockEg(){
		System.out.println("constructor");
		var=50;
	}
	//initialization blocks executes before the constructor
	{
		System.out.println("in the i block");
		var=20;
	}
	//static varaibles
	static int var;
	static String str;
	//static block - initializes the static variables
	static{
		System.out.println("in static block");
		var=10;
		str="static block";
	}

	public static void main(String[] args) {
		StaticBlockEg obj =new StaticBlockEg();

		System.out.println("in main var :"+ var);
		System.out.println("in main str :"+str);
	}

}
