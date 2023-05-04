package oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DbUtil {
	  public static String url="com.mysql.cj.jdbc.Driver";
	  public static String usr="sunbeam";
	  public static String pass="sunbeam";
      public static  Connection con;
       
      static {
    	  try {
			Class.forName(url);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      public ProductServices p = new ProductServices();
    public static Connection getConnection() throws SQLException {
    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toysdb",usr,pass);
    	return con;
    }
    
    public static Timestamp dateToTimestamp() {
		return new Timestamp(new Date().getTime());
	}
	
	public static LocalDate TimestampTodate(Timestamp timestamp) {
		LocalDateTime localDateTime = timestamp.toLocalDateTime();
		LocalDate localDate = localDateTime.toLocalDate();
		return localDate;
		
	}
	
}
