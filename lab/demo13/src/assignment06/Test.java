package assignment06;
//6. Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. Do we need to write equals() and hashCode() in Book
//class?-No, Bcoz for user defined classes if key in map is primitive type then logic of that is written that class
// but you define key as user defined class then equals() and hashCode() must overriden in that key class.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Map<String, Book> map = new HashMap<>();
        int choice=1;
        while(choice != 0) {
        	System.out.println("1.Add Book");
        	System.out.println("2.Find Book");
        	System.out.println("3.Display All");
        	System.out.print("Enter choice:");
        	choice=new Scanner(System.in).nextInt();
        	switch (choice) {
			case 1:
				System.out.print("Enter book ISBN No:");
				String isbn = new Scanner(System.in).next();
				System.out.print("Enter book price:");
				Double price = new Scanner(System.in).nextDouble();
				System.out.print("Enter Auther Name:");
				String name = new Scanner(System.in).next();
				System.out.print("Enter Quantity:");
				int qty = new Scanner(System.in).nextInt();
				
				Book b = new Book(isbn, price, name, qty);
				map.put(b.getIsbn(), b);
				System.out.println("DATA INSERTED");
				break;
			case 2:
				System.out.print("Enter book ISBN No:");
				String key = new Scanner(System.in).next();
				Book bc = map.get(key);
				System.out.println(bc);
				break;
			case 3:
				for(Map.Entry m: map.entrySet()) {
					System.out.println(m.getKey()+":"+ m.getValue());
				}
				break;

			default:
				break;
			}
        }
		
		
		
		System.out.print("Enter book ISBN No:");
		String isbn = new Scanner(System.in).next();
		System.out.print("Enter book price:");
		Double price = new Scanner(System.in).nextDouble();
		System.out.print("Enter Auther Name:");
		String name = new Scanner(System.in).next();
		System.out.print("Enter Quantity:");
		int qty = new Scanner(System.in).nextInt();
		Book b = new Book(isbn, price, name, qty);
		

	}

}
