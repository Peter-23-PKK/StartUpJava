package com.ticket.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

	private static DBConnector instance;
	private Properties props;

	private DBConnector() {
		props = new Properties();
		try (FileInputStream io = new FileInputStream("config.properties")) {
			props.load(io);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DBConnector getInstance() {
		return instance = instance != null ? instance : new DBConnector();
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.usr"),
				props.getProperty("db.pass"));
	}
}
