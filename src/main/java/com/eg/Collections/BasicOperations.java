package com.eg.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicOperations {

	public static void main(String[] args) {

		List lst1=Arrays.asList(17,299,3,488,5);
		List lst2=(List) lst1.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List"+lst2);
//		List lst3=lst1.strea
	}

}
