package com.dhakre.rohit.filehandling;

import java.io.FileOutputStream;

public class OutputString {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
			String s = "This is nothing but just a demo of FileOutputStream";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}