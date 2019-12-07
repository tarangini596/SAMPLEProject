package com.eg.Errors;

public class OutOFMemoryError {

	public static void test(int var) {
		int arr[]= {1,2,3,4,5,6};
		for(int i =0;i <=var;i++) {
			System.out.println("i :"+ arr[i]);
		}
		
		
	}
}
