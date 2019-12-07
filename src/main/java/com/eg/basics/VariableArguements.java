package com.eg.basics;

public class VariableArguements {
	
	static void fun(int ...a) {
		
		for(int i :a) {
			
			System.out.println("length is :"+ a.length);
			System.out.println("value is :"+ i);
			
		}	
		
	}

	public static void main(String[] args) {

		fun(100);
		fun(10,20);
		fun();		
		
	}

}
