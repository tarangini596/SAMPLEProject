package com.eg.Collections;

public class Hashcode_Equals {

	public static void main(String[] args) {

		Employee emp=new Employee("1","tara");
		Employee emp1=new Employee("1","tara");
		if(emp.equals(emp1)) {
			System.out.println("equals for objects : true");
			if(emp.hashCode()==emp1.hashCode()) {
				System.out.println("hashcode values : true");
			}
			else
				System.out.println("hash code values : false");
			
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}
