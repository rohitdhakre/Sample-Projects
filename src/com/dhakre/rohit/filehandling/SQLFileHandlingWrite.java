package com.dhakre.rohit.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLFileHandlingWrite {
	
	static FileWriter fw = null;
	
	static {
		try {
			fw = new FileWriter("D:/MyCodeBase/workspace/sample-project/src/com/dhakre/rohit/filehandling/abc.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from brand");
			String data = null;
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String category = rs.getString(3);
				String description = rs.getString(4);
				data = id + "|" + name + "|" + category + "|" + description + "\n";
				writeToFile(data);
			}
			fw.close();
			System.out.println("Success....");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void writeToFile(String data) {
		try {
			fw.append(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}