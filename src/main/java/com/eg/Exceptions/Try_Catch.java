package com.eg.Exceptions;

public class Try_Catch {
	static {
		System.out.println("In try-catch");
	}

	public static void main(String[] args) {
		try {
			int data = 50 / 0; 
			System.out.println("rest of the code");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		/*catch(Exception e){
			System.out.println(e);
			
		}*/finally {
			System.out.println("finally");
		}
		
		System.out.println("rest code ");


	}

}
