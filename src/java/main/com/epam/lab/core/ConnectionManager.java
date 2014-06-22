package com.epam.lab.core;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager implements Closeable, AutoCloseable {
	private static Connection conn = null;
	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/web-temp", "root", "15935700");
		} catch (SQLException e) {
			System.err.println("Error" + e);
		} catch (ClassNotFoundException e) {
			System.err.println("Error" + e);
			e.printStackTrace();
		}

		return conn;
	}
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
