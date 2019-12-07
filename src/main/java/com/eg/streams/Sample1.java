package com.eg.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {

		List<String> lst1 = new ArrayList<String>();

		lst1.add("tara");
		lst1.add("taru");
		lst1.add("priya");
		System.out.println(lst1);
		
//		lst1.sort(c);
		Collections.sort(lst1);
		System.out.println(lst1);
		
		System.out.println("Hashcode :"+lst1.hashCode());
		lst1.add("priyaaaa");
		System.out.println("Hashcode :"+lst1.hashCode());
		
		
		
		
	}
}
