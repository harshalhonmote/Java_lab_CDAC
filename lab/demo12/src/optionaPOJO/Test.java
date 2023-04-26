package optionaPOJO;

public class Test {
	public static void main(String[] args) {
		UserService us = new UserService();
		int choice = 1;
		while (choice != 0) {
			System.out.print("Enter Choice:");
			choice = Sc.sc.nextInt();

			switch (choice) {
			case 1:
				us.signUp();
				break;
			case 2: 
				us.signIn();
				break;
				
			}
			
			
		}
	}
}
