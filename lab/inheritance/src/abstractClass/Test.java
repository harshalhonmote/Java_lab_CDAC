package abstractClass;

import java.util.Scanner;

public class Test{
   
	public static int menu() {
		System.out.println("----------------------");
		System.out.println("0. Exit");
		System.out.println("1. Area of Rectangle");
		System.out.println("2. Area of Circle");
		System.out.print("Enter choice = ");	
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
	   Shape s =null;
	   int choice;
	   while((choice= Test.menu())!=0) {
		   switch(choice) {
		   case 1:
			   s=new Rectangle();
			  
			   break;
		   case 2:
			   s= new Circle();
			   break;
		   }
		   if(s != null) {
			   s.acceptData();
			   s.claArea();
			   s=null;
		   }
		   
		   
	   }
	 
	}

}
