package com.dhakre.rohit.filehandling;

import java.io.FileInputStream;

public class InputAllCharacter {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fin = new FileInputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char)i);
			}
			
			/*				OR
			int i = fin.read();
			while (i != -1) {
				System.out.println((char)i);
				i = fin.read();
			}*/
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
