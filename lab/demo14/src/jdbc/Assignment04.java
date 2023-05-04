package jdbc;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

public class Assignment04 {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dac_quotes";
	public static final String DB_USER = "sunbeam";
	public static final String DB_PASSWD = "sunbeam";
	private static int current;

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private static void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter passwd: ");
		String passwd = sc.nextLine();
		System.out.println("Enter mobile: ");
		String mobile = sc.nextLine();

		String sql = "INSERT INTO users(first_name,last_name,email,passwd,mobile) VALUES(?,?,?,?,?)";
		System.out.println(sql);

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, firstName);
				stmt.setString(2, lastName);
				stmt.setString(3, email);
				stmt.setString(4, passwd);
				stmt.setString(5, mobile);
				int cnt = stmt.executeUpdate();
				System.out.println("CNT:" + cnt);

			}
		} catch (Exception e) {
			System.out.println("USER ALREADY EXISTS");
			// e.printStackTrace();
		}

	}

	private static void signin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter passwd: ");
		String passwd = sc.nextLine();
		String sql = "SELECT id FROM users WHERE email=? AND passwd=?";
		System.out.println("SQL: " + sql);

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, email);
				stmt.setString(2, passwd);
				try (ResultSet rs = stmt.executeQuery()) {
					System.out.println(rs.next());
					current = rs.getInt("id");
					System.out.println("USER LOGGED");
				}
			}
		} catch (Exception e) {
			System.out.println("USER NOT EXISTS or CHECK EMAIL, PASSWD");
			// e.printStackTrace();
		}

	}

	private static void changeProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter mobile: ");
		String mobile = sc.nextLine();

		String sql = "UPDATE users SET first_name=?,last_name=?,mobile=? WHERE id=?";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, firstName);
				stmt.setString(2, lastName);
				stmt.setString(3, mobile);
				stmt.setInt(4, current);
				int cnt = stmt.executeUpdate();
				System.out.println("Profile Updated Sucessfully");
			}
		} catch (Exception e) {
			System.out.println("USER NOT EXISTS or CHECK EMAIL, PASSWD");
			// e.printStackTrace();
		}

	}

	private static void changePassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New passwd: ");
		String passwd = sc.nextLine();

		String sql = "UPDATE users SET passwd=? WHERE id=?";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, passwd);
				stmt.setInt(2, current);
				int cnt = stmt.executeUpdate();
				System.out.println("Passwd Updated Sucessfully");
			}

		} catch (Exception e) {
			System.out.println("USER NOT EXISTS or CHECK EMAIL, PASSWD");
			// e.printStackTrace();
		}
	}

//-------------------------------------------------
	private static void displayAllQuotes() {
		String sql = "SELECT id, quote, author, user_id FROM quotes";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int id = rs.getInt("id");
						String quote = rs.getString("quote");
						String author = rs.getString("author");
						int uId = rs.getInt("user_id");
						System.out.printf("%d, %s, %s, %d\n", id, quote, author, uId);
					}
				}

			}
		} catch (Exception e) {
			System.out.println("USER NOT EXISTS or CHECK EMAIL, PASSWD");
			// e.printStackTrace();
		}

	}

	private static void displayQuotesOfUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Id: ");
		int userId = sc.nextInt();
		String sql = "SELECT id, quote, author, user_id FROM quotes WHERE user_id = ?";
		System.out.println("SQL: " + sql);

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, userId);
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int id = rs.getInt("id");
						String quote = rs.getString("quote");
						String author = rs.getString("author");
						int uId = rs.getInt("user_id");
						System.out.printf("%d, %s, %s, %d\n", id, quote, author, uId);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("USER NOT EXISTS or CHECK EMAIL, PASSWD");
			// e.printStackTrace();
		}
	}
	
	private static void addQuote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New Quote: ");
		String quoteStr = sc.nextLine();
		System.out.println("Enter Author: ");
		String author = sc.nextLine();
		System.out.println("Enter User Id: ");
		int userId = sc.nextInt();
		
		String sql = "INSERT INTO quotes(quote,author,user_id,created_at) VALUES(?,?,?,?)";
		System.out.println("SQL: " + sql);
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, quoteStr);
				stmt.setString(2, author);
				stmt.setInt(3, userId);
				long time = new Date().getTime();
				Timestamp ts = new Timestamp(time);
				stmt.setTimestamp(4, ts);
				
				int cnt = stmt.executeUpdate();
				System.out.println("Rows affected: " + cnt);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void editQuote() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Quote Id: ");
		int quoteId = Integer.parseInt(sc.next());
		System.out.println("Enter Updated Quote: ");
		String quoteStr = sc.nextLine();
		sc.next();
		System.out.println("Enter Author: ");
		String author = sc.nextLine();
	   
		String sql = "UPDATE quotes SET quote=?,author=? WHERE id=? AND user_id=?";
		System.out.println("SQL: " + sql);
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, quoteStr);
				stmt.setString(2, author);
				stmt.setInt(3, quoteId);
				stmt.setInt(4, current);
				int cnt = stmt.executeUpdate();
				System.out.println("Rows affected: " + cnt);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// signup();
		System.out.println(current);
		 signin();
		// changeProfile();
		// changePassword();
		displayAllQuotes();
		//displayQuotesOfUser();
		addQuote();
		editQuote();
		displayAllQuotes();
	
	}

}
