package daoproject;

import java.util.Scanner;



public class UserService {
	private UserDao userDao;
	private User u;
	
	public UserService() {
		try {
			userDao = new UserDao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		userDao.close();
	}
	
	public void signUp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Name: ");
		String firstName = sc.next();
		System.out.print("Last Name: ");
		String lastName = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Password: ");
		String passwd = sc.next();
		System.out.print("Mobile: ");
		String mobile = sc.next();
		
		User u = new User(0, firstName, lastName, email, passwd, mobile);
		
		try {
			int cnt = userDao.save(u);
			System.out.println("Users Saved: " + cnt);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public User signIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Password: ");
		String passwd = sc.next();	
		
		try {
			 u = userDao.findByEmailAndPasswd(email, passwd);
		    if(u != null) {
		    	//System.out.println("Hello "+u.getFirstName());
		    	return u;
		    }
		    //else 
		    	//System.out.println("Invalid email or password.");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void changePassword() {
		Scanner sc = new Scanner(System.in);
		System.out.print("New Password: ");
		String passwd = sc.next();
		try {
			int cnt = userDao.changePassword(u.getId(), passwd);
			System.out.println("Password changed: " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeProfile() {
		User localUser = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER FIRST NAME:");
		localUser.setFirstName(sc.next());
		System.out.print("ENTER LAST NAME:");
		localUser.setLastName(sc.next());
		System.out.print("ENTER EMAIL ID:");
		localUser.setEmail(sc.next());
		
	}
	
	
	
	
	
	
	
	
}
