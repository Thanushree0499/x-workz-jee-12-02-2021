package com.xworkz.nykaastore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectionToCosmeticsTable {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/nykaa";
		String username="root";
		String password="root123";
		
		try {
			Connection connection=DriverManager.getConnection(url, username, password);
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
