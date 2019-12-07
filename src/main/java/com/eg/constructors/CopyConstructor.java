package com.eg.constructors;

public class CopyConstructor {
	
	String name;
	

	public static void main(String[] args) {
		CopyConstructor copyConstructorObj1=new CopyConstructor("TARA");
		copyConstructorObj1.display();
		CopyConstructor copyConstructorObj2=new CopyConstructor(copyConstructorObj1);
		copyConstructorObj2.display();
		
		
	}

	public CopyConstructor(String name) {
		this.name=name;
	}
	
	public CopyConstructor(CopyConstructor obj) {
		
		name=obj.name;
	}
	
	public void display() {
		System.out.println("the name :"+ name);
	}
	
	

}
