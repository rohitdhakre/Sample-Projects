package com.dhakre.rohit.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class FileHandlingDemo {

	static Connection conn = null;
	static PreparedStatement stmt = null;
	private Map<String, Integer> map = null;

	static {
		try {
			System.out.println("Establishing connection");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_test", "root", "root");
			System.out.println("Connected");
			System.out.println("Truncating all tables");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("SET FOREIGN_KEY_CHECKS = 0;");
			stmt.executeUpdate("truncate rating;");
			stmt.executeUpdate("truncate movies_genre;");
			stmt.executeUpdate("truncate movie;");
			stmt.executeUpdate("truncate users;");
			stmt.executeUpdate("truncate genre;");
			stmt.executeUpdate("truncate occupation;");
			System.out.println("Successfully truncated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			FileHandlingDemo data = new FileHandlingDemo();
			System.out.println("Populating data......");
			data.initializeOccupations();
			data.initializeGenres();
			data.initializeUsers();
			data.initializeMovies();
			data.initializeRatings();
			stmt.executeUpdate("SET FOREIGN_KEY_CHECKS = 1;");
			System.out.println("Successfully all data populated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializeOccupations() {
		try {
			System.out.println("Populating data into occupation table");
			String[] str = { "other", "academic/educator", "artist", "clerical/admin", "college/grad student", "customer service",
					"doctor/health care", "executive/managerial", "farmer", "homemaker", "K-12 student", "lawyer", "programmer", "retired",
					"sales/marketing", "scientist", "self-employed", "technician/engineer", "tradesman/craftsman", "unemployed", "writer" };
			stmt = conn.prepareStatement("insert into occupation set id = ?, description = ? ;");
			for (int i = 0; i <= 20; i++) {
				stmt.setInt(1, i);
				stmt.setString(2, str[i]);
				stmt.execute();
			}
			System.out.println("Successfully populated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void initializeGenres() {
		try {
			System.out.println("Populating data into genre table");
			String[] str = { "Action", "Adventure", "Animation", "Children's", "Comedy", "Crime", "Documentary", "Drama", "Fantasy", "Film-Noir",
					"Horror", "Musical", "Mystery", "Romance", "Sci-Fi", "Thriller", "War", "Western" };
			stmt = conn.prepareStatement("insert into genre set id = ?, name = ? ;");
			map = new HashMap<>();
			for (int i = 1; i <= 18; i++) {
				stmt.setInt(1, i);
				stmt.setString(2, str[i - 1]);
				stmt.execute();
				map.put(str[i - 1], i);
			}
			System.out.println("Successfully populated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void initializeUsers() {
		try (FileReader fr = new FileReader("D:/My Work/Fragma Data Systems/usersTest.dat"); BufferedReader bfr = new BufferedReader(fr);) {
			String str = null;
			stmt = conn.prepareStatement("insert into users set id = ?, gender = ?, age = ?, occupation_id = ?, zip_code = ? ;");
			System.out.println("Populating data into users table");
			while ((str = bfr.readLine()) != null) {
				try {
					String[] col = str.split("::");
					stmt.setInt(1, Integer.parseInt(col[0]));
					stmt.setString(2, col[1]);
					stmt.setInt(3, Integer.parseInt(col[2]));
					stmt.setInt(4, Integer.parseInt(col[3]));
					stmt.setString(5, col[4]);
					stmt.execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Successfully populated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializeMovies() {
		try (FileReader fr = new FileReader("D:/My Work/Fragma Data Systems/moviesTest.dat"); BufferedReader bfr = new BufferedReader(fr);) {
			String str = null;
			stmt = conn.prepareStatement("insert into movie set id = ?, title = ? ;");
			System.out.println("Populated data into movie table and movies_genre table");
			while ((str = bfr.readLine()) != null) {
				try {
					String[] col = str.split("::");
					int i = Integer.parseInt(col[0]);
					stmt.setInt(1, i);
					stmt.setString(2, col[1]);
					stmt.execute();
					initializeMoviesGenres(i, col[2]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Successfully populated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializeMoviesGenres(int movieId, String movieGenres) {
		try {
			String[] genres = movieGenres.split("[|]");
			Statement state = conn.createStatement();
			for (int i = 0; i < genres.length; i++) {
				state.executeUpdate("insert into movies_genre set movie_id = " + movieId + ", genre_id = " + map.get(genres[i]) + ";");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initializeRatings() {
		try (FileReader fr = new FileReader("D:/My Work/Fragma Data Systems/ratingsTest.dat"); BufferedReader bfr = new BufferedReader(fr);) {
			String str = null;
			stmt = conn.prepareStatement("insert into rating set user_id = ?, movie_id = ?, rating = ?, created = ? ;");
			System.out.println("Populating data into rating table");
			while ((str = bfr.readLine()) != null) {
				try {
					String[] col = str.split("::");
					stmt.setInt(1, Integer.parseInt(col[0]));
					stmt.setInt(2, Integer.parseInt(col[1]));
					stmt.setInt(3, Integer.parseInt(col[2]));
					stmt.setDate(4, new Date(Long.parseLong(col[3])));
					stmt.execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Successfully populated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
