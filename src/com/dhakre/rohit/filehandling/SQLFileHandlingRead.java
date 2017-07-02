package com.dhakre.rohit.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLFileHandlingRead {

	static Connection con = null;
	static PreparedStatement stmt = null;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (
				FileReader fr = new FileReader("D:/MyCodebase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
				BufferedReader bfr = new BufferedReader(fr);
			) {
			String str = null;
			stmt = con.prepareStatement("insert into brand(name, category, description) values (?, ?, ?)");
			while ((str = bfr.readLine()) != null) {
				String[] arr = str.split("[|]");
				stmt.setString(1, arr[1]);
				stmt.setString(2, arr[2]);
				stmt.setString(3, arr[3]);
				stmt.execute();
			}
			System.out.println("Successfully write in database");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}