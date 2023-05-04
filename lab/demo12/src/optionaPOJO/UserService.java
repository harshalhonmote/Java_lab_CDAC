package optionaPOJO;

public class UserService {
    private UserDao ud = new UserDao();
    public static User current;
	public void signIn() {
		// use UserDao to find user with email and password.
		// QuotesApp.user = user;
		System.out.print("ENTER EMAIL ID:");
		String email = Sc.sc.next();
		System.out.print("ENTER PASSWD:");
		String passwd = Sc.sc.next();
		
		current = ud.findByEmailAndPassword(email, passwd);
		if(current == null) {
			System.out.println("USER IS NOT VALID!!");
		}else {
			System.out.println("USER LOGGED IN");
		}
		
	}

	public void signUp() {
		User temp = new User();
		System.out.print("ENTER FIRST NAME:");
		temp.setFirstName(Sc.sc.next());
		System.out.print("ENTER LAST NAME:");
		temp.setLastName(Sc.sc.next());
		System.out.print("ENTER EMAIL ID:");
		temp.setEmail(Sc.sc.next());
		System.out.print("ENTER PASSWD:");
		temp.setPasswd(Sc.sc.next());
		
		ud.addUser(temp);
	}

	public void changePassword() {
		System.out.print("ENTER NEW PASSWD:");
		current.setPasswd(Sc.sc.next());
		System.out.println("PASSWD UPDATED SUCESSFULLY");
	}

	public void changeProfile() {
		System.out.print("ENTER FIRST NAME:");
		current.setFirstName(Sc.sc.next());
		System.out.print("ENTER LAST NAME:");
		current.setLastName(Sc.sc.next());
		System.out.print("ENTER EMAIL ID:");
		current.setEmail(Sc.sc.next());
	}

}
