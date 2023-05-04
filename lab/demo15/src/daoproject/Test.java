package daoproject;


public class Test {
    
	public static void main(String[] args) {
		
		 User current;
		UserService userService = new UserService();
		
		//userService.signUp();
       
		try {
			current	= userService.signIn();
			if(current != null)
				System.out.println("Hello "+current.getFirstName());
			else
				System.out.println("Invalid email or password.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userService.changePassword();
		
		
		
		
		userService.close();
	}

}
