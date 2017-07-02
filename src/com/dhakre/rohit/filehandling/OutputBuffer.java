package com.dhakre.rohit.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class OutputBuffer {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "A coder must need to learn C language as the primary language.";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Success........");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
