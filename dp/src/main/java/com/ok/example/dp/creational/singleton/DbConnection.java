package com.ok.example.dp.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DbConnection {

	ORACLE_CONNECTION("ORACLE"), MYSQL_CONNECTION("MYSQL"),;

	private Connection connection;

	private DbConnection(String database) {

		switch (database) {

		case "ORACLE":
			
			try {
				// load jdbc Driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// establishing the connection using DriverManger class.
				this.connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb", "mydb");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			break;

		case "MYSQL":

			break;
		}
	}

	public Connection getConnection() {
		return this.connection;
	}

}
