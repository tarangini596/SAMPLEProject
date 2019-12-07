package com.eg.basics;

public class CollegeStudent extends Student{
	int sal=10000;
	 public void show(){
         System.out.println("College details");
   }

	public static void main(String[] args) {

		Student Obj=new CollegeStudent();
		Obj.show();
		System.out.println("salary : "+Obj.sal);
	}

}

class Student{
	int sal=10;
	 public void show(){
         System.out.println("Student details");
   }
	
}
