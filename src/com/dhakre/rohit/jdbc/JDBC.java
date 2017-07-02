package com.dhakre.rohit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			Statement stmt = con.createStatement();
			int res  = stmt.executeUpdate("delete from Student where name like 'ja%'");
			System.out.println(res);
			ResultSet rs = stmt.executeQuery("select * from Student");
			while(rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getString("result"));
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

