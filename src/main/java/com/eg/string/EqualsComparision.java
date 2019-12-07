package com.eg.string;

public class EqualsComparision {
	static {
		System.out.println("In EqualsComparision");
	}

	public static void main(String args[]) {

		int var = 96;
		int var2 = 96;
		float val=9.0f;
		float val1=9.0f;
		boolean fltcmp= val==val1;
		System.out.println("float cmp :"+fltcmp);
		
		String str3 = "TARA";
		String str4 = "TARA";
		boolean strCmp1 = str3 == str4;
		System.out.println("strmp1:" + strCmp1);
		
		boolean strCmp2 = str3.equals(str4);
		System.out.println("strmp1:" + strCmp2);
		
		String str = new String("TARA");
		String str2 =new String("TARA");

		boolean varComp = var == var2;
		System.out.println("varComp :" + varComp);

		boolean strCmp = str == str2;
		System.out.println("strsmp:" + strCmp);

		boolean strComp1 = str.equals(str2);
		System.out.println("strComp1 :" + strComp1);

		if (var == var2) {
			if (str.equals(str2)) {

				if (str == str2) {
					System.out.println("Hi");

				}
			}

		}

	}

}
