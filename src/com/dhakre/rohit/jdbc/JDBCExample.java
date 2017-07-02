package com.dhakre.rohit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class JDBCExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			PreparedStatement stmt = con.prepareStatement("update class set name = ?, stream = ?, section = ?, gender = ? where rollNo = ?");
			stmt.setString(1, "Robin");
			stmt.setString(2,  "maths");
			stmt.setString(3, "A");
			stmt.setString(4, "M");
			stmt.setInt(5, 10017);
			stmt.execute();
			stmt.setString(1, "Saggy");
			stmt.setString(2,  "biology");
			stmt.setString(3, "D");
			stmt.setString(4, "M");
			stmt.setInt(5, 10021);
			stmt.execute();
			stmt.setString(1, "Tanu");
			stmt.setString(2,  "commerce");
			stmt.setString(3, "B");
			stmt.setString(4, "F");
			stmt.setInt(5, 10023);
			stmt.execute();
			int res = stmt.executeUpdate();
			System.out.println(res);
			ResultSet rs = stmt.executeQuery("select * from class order by rollNo");
			while (rs.next()) {
				System.out.println(rs.getInt("rollNo") + " " + rs.getString("name") + " " + rs.getString("stream") + " " + rs.getString("section") + " " + rs.getString("gender"));
			}
			con.close();
		} catch (Exception e) {
			System.out.print(e);
		}

	}

}
