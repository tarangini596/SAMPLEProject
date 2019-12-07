package com.eg.string;

public class StringPooling {
	static {
		System.out.println("In String pooling Class ");
	}

	public static void main(String[] args) {

		String str1="tara"; // String literal
		String str2="tara"; //String literal
		String str3=new String("tara"); //String object
		String str4=new String("tara"); // String Object
		
		String str="a";
		
		int hashcode =str.hashCode();
		System.out.println("Hashcode of a is :"+hashcode);
		
		
		//comparing the String literals
		boolean strpoolCmp=str1== str2;
		System.out.println("strpoolCmp:"+strpoolCmp);
		
		boolean strcmp=str1.equals(str2);
		System.out.println("strpoolCmp:"+strcmp);
		
		
		//comparing the String objects  with String literals
		boolean strcmp1=str1==str4;
		System.out.println("strcmp:"+strcmp1);
		boolean strpoolCmp1=str1.equals(str4);
		System.out.println("strpoolCmp1:"+strpoolCmp1);
		
		//comparing String Objects
		boolean strcmp4=str3.equals(str4);
		System.out.println("strcmp4:"+strcmp4);
		boolean strcmp5=str3==str4;
		System.out.println("strcmp5:"+strcmp5);
		
		
	
	}

}
