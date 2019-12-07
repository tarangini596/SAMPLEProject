package com.eg.string;

public class StringInterning {
	static {
		System.out.println("In the String Intern");
	}

	public static void main(String[] args) {

		
		String str1="tara";
		String str3="TARA";
		if(str1==str3) {
			System.out.println("true");
		}
		
		String str2=new String("tara");
		String newintern=str2.intern();
//		boolean strcmp= str1==newintern;
		boolean strcmp= str1==str2;
		
		System.out.println("strcmp :"+strcmp);
		
	}

}
