package com.dhakre.rohit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPreparedStatement {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			PreparedStatement stmt = con.prepareStatement("delete from Student where sno = ?");
			stmt.setInt(1, 4);
			int i = stmt.executeUpdate();
			System.out.println(i);
			ResultSet rs = stmt.executeQuery("select * from Student");
			while (rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getInt("sno"));
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
