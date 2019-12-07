package com.eg.samplePrograms;

public class DuplicateStringsPrint {

	public static void main(String[] args) {

		String str="i am am learning java java";
		String[] str1=str.split(" ");
		int count;
//		System.out.println(str1[0]);
		for(int i=0;i<str1.length;i++) {
			count=0;
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i].equals(str1[j])) {
//					count ++;
					System.out.println("DUPLICATE STRING :"+str1[j]);
				}
		
				
			}
//			System.out.println("count of "+str1[i]+"is"+count);
//			System.out.println(str1[i]);
		}
	}

}


