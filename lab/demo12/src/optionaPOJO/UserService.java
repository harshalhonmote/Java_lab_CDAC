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

	}

	public void changeProfile() {

	}

}
