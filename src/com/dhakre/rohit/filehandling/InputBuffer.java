package com.dhakre.rohit.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputBuffer {

	public static void main(String[] args) {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
			bin = new BufferedInputStream(fin);
			int i = 0;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bin.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}