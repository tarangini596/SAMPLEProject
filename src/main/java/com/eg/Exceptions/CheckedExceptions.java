package com.eg.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
	static {
		System.out.println("In checked Exceptions -- COMPILETIME");
		System.out.println("checking FileNot Fpund Exceptions");
	}

	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file);
	}

}
