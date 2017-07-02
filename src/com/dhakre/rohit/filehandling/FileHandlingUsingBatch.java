package com.dhakre.rohit.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileHandlingUsingBatch {

	Connection conn = null;
	PreparedStatement stmt = null;

	public static void main(String[] args) {
		FileHandlingUsingBatch batch = new FileHandlingUsingBatch();
		batch.storeData();
	}

	public FileHandlingUsingBatch() {
		super();
		try {
			System.out.println("Establishing Connection");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_test", "root", "root");
			System.out.println("Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void storeData() {
		try (BufferedReader bfr = new BufferedReader(new FileReader("D:/My Work/Fragma Data Systems/ratings.dat"));) {
			String str = null;
			final int batchSize = 1000;
			int count = 0;
			stmt = conn.prepareStatement("insert into rating set user_id = ?, movie_id = ?, rating = ?, created = ? ;");
			System.out.println("Populating data into rating table");
			while ((str = bfr.readLine()) != null) {
				try {
					String[] col = str.split("::");
					stmt.setInt(1, Integer.parseInt(col[0]));
					stmt.setInt(2, Integer.parseInt(col[1]));
					stmt.setInt(3, Integer.parseInt(col[2]));
					stmt.setDate(4, new Date(Long.parseLong(col[3])));
					stmt.addBatch();
					count++;
					if (count % batchSize == 0) {
						stmt.executeBatch();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			stmt.executeBatch();
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
