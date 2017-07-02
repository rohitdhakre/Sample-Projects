package com.dhakre.rohit.filehandling;

import java.io.FileInputStream;

public class InputCharacter {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
			char ch = (char)fin.read();
			
			/*			OR
			 * int i = fin.read();
			System.out.println((char)i);*/
			
			System.out.println(ch);
			fin.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}