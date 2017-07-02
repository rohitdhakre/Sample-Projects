package com.dhakre.rohit.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class InputSequenceStream {

	public static void main(String[] args) {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		SequenceInputStream sin = null;
		try {
			fin1 = new FileInputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/demo.txt");
			fin2 = new FileInputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abcNew.txt");
			sin = new SequenceInputStream(fin1, fin2);
			int i = sin.read();
			while (i != -1) {
				System.out.print((char)i);
				i = sin.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sin.close();
				fin2.close();
				fin1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
