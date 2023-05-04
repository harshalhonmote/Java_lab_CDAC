package karadbug;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/btsdb";
	public static final String DB_USER = "sunbeam";
	public static final String DB_PASSWORD = "sunbeam";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER,DB_PASSWORD);
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
	  public void close() {
	    	try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	    }
	
/*	
	public static void main(String[] args) {
	   	Scanner sc = new Sacanner(System.in);
		int choice=1;
		while(choice != 0) {
			
			System.out.print("Enter Choice :");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Enter Valid choice !!!");
				break;
			}
		}	
	}
*/
	
}