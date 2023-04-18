package upcasting;

import java.util.Scanner;

public class Student extends Main{
       private int roll;
       private String name;
       
       @Override
       void acceptData() {
    	   System.out.print("Enter student Roll:");
    	   this.roll = new Scanner(System.in).nextInt();
    	   System.out.print("Enter student Name:");
    	   this.name= new Scanner(System.in).nextLine();
       }
       @Override
       void displayData() {
    	   System.out.println("Roll :"+this.roll);
    	   System.out.println("Name :"+this.name);
       }
}
