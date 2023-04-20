package upcasting;

import java.util.Scanner;

public class Emp extends Main{
       private int empno;
       private String empname;
       
       //@Override
       void acceptData() {
    	   System.out.print("Enter emp no:");
           this.empno=new Scanner(System.in).nextInt();
           System.out.print("Enter emp name:");
           this.empname=new Scanner(System.in).nextLine();
           super.acceptData();
       }  
       @Override
       void displayData() {
    	   System.out.println("empno :"+this.empno);
    	   System.out.println("Name :"+this.empname);
    	   super.displayData();
       }
}
