package daoproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dac_quotes";
	public static final String DB_USER = "sunbeam";
	public static final String DB_PASSWD = "sunbeam";
 
	
	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
		return con;
	}
	
}
