package com.eg.keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientEg {
	
	
	private int a=10;
	private transient int b=20;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		TransientEg input = new TransientEg(); 
		  
/*	        // serialization 
	        FileOutputStream fos = new FileOutputStream("src/test/resources/abc.txt"); 
	        ObjectOutputStream oos = new ObjectOutputStream(fos); 
	        oos.writeObject(input); */
	  
	        // de-serialization 
	        FileInputStream fis = new FileInputStream("src/test/resources/abc.txt"); 
	        ObjectInputStream ois = new ObjectInputStream(fis); 
	        TransientEg output = (TransientEg)ois.readObject();
		TransientEg obj=new TransientEg();
	        System.out.println("a = " + obj.a); 
	        System.out.println("b = " + obj.b); 

	}

}
