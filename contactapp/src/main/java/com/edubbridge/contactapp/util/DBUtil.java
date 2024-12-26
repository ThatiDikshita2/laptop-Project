package com.edubbridge.contactapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DBUtil db= new DButils();

public class DBUtil {
	private static Connection con = null;
	
	private DBUtil() {}
	public static Connection getConnection() {
		if(con == null) {
		String driver,url,user,password;
		driver = "com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/db12980";
        user= "root";
        password="root";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("no driver found");
		}
		
		try {
			con= DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		return con;
	}

	}