package com.dhakre.rohit.filehandling;

import java.io.FileOutputStream;

public class OutputByte {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("D:/mycodebase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
			fout.write(67);
			fout.close();
			System.out.println("Success.....");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}