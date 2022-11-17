package org.simplilearn.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

	public static Connection getConnection(String driver,String url,String username,String pwd)
	{
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
