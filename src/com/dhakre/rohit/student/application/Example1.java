package com.dhakre.rohit.student.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example1 {

	public static Connection con = null;
	public static Scanner scan = null;

	static {
		initializeConnection();
		initializeScanner();
	}

	public static void initializeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		} catch (Exception e) {
			System.out.println(
					"Sorry, can't get connection with database you provided, either provided database doesn't exist or check entered driver class");
			System.exit(0);
		}
	}

	public static void initializeScanner() {
		scan = new Scanner(System.in);
	}

	public static void main(String[] args) {

		boolean flag = true;
		while (flag) {
			System.out.println("Choose any one option :");
			System.out.println("1. Show all");
			System.out.println("2. Show student by roll number");
			System.out.println("3. Edit data by roll number");
			System.out.println("4. Insert new data");
			System.out.println("5. Delete data by roll number");
			System.out.println("6. Exit");
			int i = scan.nextInt();
			switch (i) {
			case 1:
				getAllData();
				break;
			case 2:
				getDataByRollNo();
				break;
			case 3:
				editDataByRollNo();
				break;
			case 4:
				addNewData();
				break;
			case 5:
				deleteDataByRollNo();
				break;
			case 6:
				exitMenu();
				flag = false;
				break;
			default:
				System.out.println("Invalid input, choose another option.");
			}
		}
	}

	static void getAllData() {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from class");
			while (rs.next()) {
				System.out.println("{");
				System.out.println(String.format("%-12s", "	Roll Number") + " : " + rs.getString(1));
				System.out.println(String.format("%-12s", "	Name") + " : " + rs.getString(2));
				System.out.println(String.format("%-12s", "	Stream") + " : " + rs.getString(3));
				System.out.println(String.format("%-12s", "	Section") + " : " + rs.getString(4));
				System.out.println(String.format("%-12s", "	Gender") + " : " + rs.getString(5));
				System.out.println("}");
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Invalid query");
		}
	}

	static void getDataByRollNo() {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			System.out.print("Enter student roll number : ");
			ResultSet rs = stmt.executeQuery("select * from class where rollNo = " + scan.next());
			if (!rs.next()) {
				System.out.println("Roll No doesn't exists.");
				return;
			}
			while (rs.next()) {
				System.out.println("{");
				System.out.println(String.format("%-12s", "	Roll Number") + " : " + rs.getString(1));
				System.out.println(String.format("%-12s", "	Name") + " : " + rs.getString(2));
				System.out.println(String.format("%-12s", "	Stream") + " : " + rs.getString(3));
				System.out.println(String.format("%-12s", "	Section") + " : " + rs.getString(4));
				System.out.println(String.format("%-12s", "	Gender") + " : " + rs.getString(5));
				System.out.println("}");
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Exception : " + e);
		}
	}

	static void editDataByRollNo() {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(
					"update class set name = ?, stream = ?, section = ?, gender = ? where rollNo = ?");
			System.out.print("Enter student's roll number : ");
			String r = scan.next();
			stmt.setString(5, r);
			System.out.print("Updated student's name : ");
			stmt.setString(1, scan.next());
			System.out.print("Student's stream : ");
			stmt.setString(2, scan.next());
			System.out.print("Student's section : ");
			stmt.setString(3, scan.next());
			System.out.print("Gender(M/F) : ");
			stmt.setString(4, scan.next());
			stmt.execute();
			ResultSet rs = stmt.executeQuery("select * from class where rollno = " + r);
			while (rs.next()) {
				System.out.println("{");
				System.out.println(String.format("%-12s", "	Roll Number") + " : " + rs.getString(1));
				System.out.println(String.format("%-12s", "	Name") + " : " + rs.getString(2));
				System.out.println(String.format("%-12s", "	Stream") + " : " + rs.getString(3));
				System.out.println(String.format("%-12s", "	Section") + " : " + rs.getString(4));
				System.out.println(String.format("%-12s", "	Gender") + " : " + rs.getString(5));
				System.out.println("}");
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Invalid data");
		}
	}

	static void addNewData() {
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into class(name, stream, section, gender) values(?, ?, ?, ?)");
			System.out.print("Student's name : ");
			stmt.setString(1, scan.next());
			System.out.print("Student's stream : ");
			stmt.setString(2, scan.next());
			System.out.print("Student's section : ");
			stmt.setString(3, scan.next());
			System.out.print("Gender(M/F) : ");
			stmt.setString(4, scan.next());
			stmt.execute();
			ResultSet rs = stmt.executeQuery("select * from class");
			while (rs.next()) {
				System.out.println("{");
				System.out.println(String.format("%-12s", "	Roll Number") + " : " + rs.getString(1));
				System.out.println(String.format("%-12s", "	Name") + " : " + rs.getString(2));
				System.out.println(String.format("%-12s", "	Stream") + " : " + rs.getString(3));
				System.out.println(String.format("%-12s", "	Section") + " : " + rs.getString(4));
				System.out.println(String.format("%-12s", "	Gender") + " : " + rs.getString(5));
				System.out.println("}");
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Invalid data");
		}
	}

	static void deleteDataByRollNo() {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			System.out.print("Enter student's roll number to be deleted : ");
			stmt.executeUpdate("delete from class where rollno = " + scan.next());
			ResultSet rs = stmt.executeQuery("select * from class");
			while (rs.next()) {
				System.out.println("{");
				System.out.println(String.format("%-12s", "	Roll Number") + " : " + rs.getString(1));
				System.out.println(String.format("%-12s", "	Name") + " : " + rs.getString(2));
				System.out.println(String.format("%-12s", "	Stream") + " : " + rs.getString(3));
				System.out.println(String.format("%-12s", "	Section") + " : " + rs.getString(4));
				System.out.println(String.format("%-12s", "	Gender") + " : " + rs.getString(5));
				System.out.println("}");
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Invalid rollno");
		}
	}

	static void exitMenu() {
		System.out.println("Exiting....");
	}

	protected void finalize() {
		try {
			System.out.println("Closing DB Connection.");
			con.close();
			System.out.println("Closing Scanner Connection.");
			scan.close();
		} catch (Exception e) {
			System.out.println("Error in closing connection");
		}
	}

}
