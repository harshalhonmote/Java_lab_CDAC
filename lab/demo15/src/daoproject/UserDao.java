package daoproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private Connection con;
	private PreparedStatement insertUserStmt;
	private PreparedStatement findByEmailAndPasswdStmt;
	private PreparedStatement changePasswdStmt; 
	
	public UserDao() throws Exception {
	     con = DbUtil.getConnection();
	     
	     String insertUserSql="INSERT INTO users(first_name,last_name,email,passwd,mobile) VALUES(?,?,?,?,?)";
		 insertUserStmt = con.prepareStatement(insertUserSql);
		 
		 String findByEmailAndPasswdSql = "SELECT * FROM users WHERE email=? AND passwd=?";
		 findByEmailAndPasswdStmt = con.prepareStatement(findByEmailAndPasswdSql);
		 
		 String changePasswdSql = "UPDATE users SET passwd=? WHERE id=?";
		 changePasswdStmt = con.prepareStatement(changePasswdSql);
		 
	}
	
	public void close() {
		try {
			
			changePasswdStmt.close();
			findByEmailAndPasswdStmt.close();
			insertUserStmt.close();
			con.close();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}
	
	//SingUp User
	public int save(User u) throws Exception {
		int cnt=0;
        insertUserStmt.setString(1, u.getFirstName());
        insertUserStmt.setString(2,u.getLastName());
        insertUserStmt.setString(3,u.getEmail());
        insertUserStmt.setString(4,u.getPasswd());
        insertUserStmt.setString(5,u.getMobile());
        cnt = insertUserStmt.executeUpdate();
        return cnt;
	}
	
	//SignIn
	public User findByEmailAndPasswd(String email,String passwd)throws Exception {
		findByEmailAndPasswdStmt.setString(1,email);
		findByEmailAndPasswdStmt.setString(2,passwd);
		
		ResultSet rs = findByEmailAndPasswdStmt.executeQuery();
		if(rs.next()) {
			int userId = rs.getInt("id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			email = rs.getString("email");
		    passwd = rs.getString("passwd");
			String mobile = rs.getString("mobile");
			User u = new User(userId, firstName, lastName, email, passwd, mobile);
			return u;
		}
		
		return null;
	}
	
	public int changePassword(int userId, String newPassword) throws Exception {
		changePasswdStmt.setString(1, newPassword);
		changePasswdStmt.setInt(2, userId);
		int cnt = changePasswdStmt.executeUpdate();
		return cnt;
		
	}
	
	public int changeProfile(User u) {
		return 0;
	}
	
}
