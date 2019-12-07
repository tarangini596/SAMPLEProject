package com.eg.string;

public class StringBufferVsBuilder {
	static{
		System.out.println("In StringBufferVsBuilder");
		
	}

	public static void main(String[] args) {

		StringBuffer strbuf=new StringBuffer("TARA");
		System.out.println("StringBuffer :"+strbuf);
		String str=strbuf.toString();
		System.out.println("String :"+str);
		
		strbuf.append("NGINI");
		System.out.println("StringBuffer :"+strbuf);

	}

}
