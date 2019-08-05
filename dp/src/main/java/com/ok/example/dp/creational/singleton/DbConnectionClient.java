package com.ok.example.dp.creational.singleton;

import java.sql.Connection;

public class DbConnectionClient {

	public static void main(String[] args) {
		
		Connection con1 = DbConnection.ORACLE_CONNECTION.getConnection();
		Connection con2 = DbConnection.ORACLE_CONNECTION.getConnection();
		Connection con3 = DbConnection.ORACLE_CONNECTION.getConnection();
		System.out.println(con1 == con2);
		System.out.println(con1 == con3);		

	}

}
