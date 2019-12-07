package com.eg.Exceptions;

public class Try_multipleCatch {
	static {
	System.out.println("In try-multiplecatch");
	}
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        //this statement will not execute if above statements throws an exception
        
        System.out.println("in try ");
        }  
            //handling the exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }


}
