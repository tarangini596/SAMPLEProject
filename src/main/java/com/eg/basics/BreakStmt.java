package com.eg.basics;

public class BreakStmt {
	BreakStmt(){
		System.out.println("in the break statement");
	}

	public static void main(String[] args) {

		int var=10;
		while(var >0) {
		if(var==10) {	
			display();
			break;			
		}
		}
		System.out.println("in the mail block");
		
	}

	static void display() {
		System.out.println("In the display ");
	}
}
