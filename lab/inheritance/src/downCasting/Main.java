package downCasting;

import java.util.ArrayList;
import java.util.Scanner;

import upcasting.Emp;

public class Main {
	private String name;
	
	 public static int menu() {
		 System.out.println("0. EXIT");
			//todo -> menu fror adding student & employee
			System.out.println("1. Dispaly All Records");
			System.out.println("2. Display Only Employees");
			System.out.println("3. Display Only Students");
			System.out.println("4. dispay emp");
			System.out.println("5. dispay stu");
			System.out.println("6. Add emp");
			System.out.println("7. Add student");
			System.out.print("Enter choice = ");
			return new Scanner(System.in).nextInt();
	 }
	void acceptData() {
		System.out.print("Enter main name:");
		this.name= new Scanner(System.in).next();
	}
	void displayData() {
		System.out.println("main Name:"+this.name);
	}
	
	public static void main(String[] args) {
         ArrayList<Main> marr = new ArrayList<Main>();
         Main m=null;
         //int index=0;
         int choice;
         while((choice= menu())!=0) {
        	 switch(choice) {
        	 case 1:
        		 
        		 for(Main x:marr) {
        			 x.displayData();
        		 }
        		 break;
        	 case 2:
        		 for(Main x:marr) {
        			 if(x instanceof Employee) {
        				 x.displayData();
        			 }
        		 }
        		 break;
        	 case 3:
        		 for(Main x:marr) {
        			 if(x instanceof Student) {
        				 x.displayData();
        			 }
        		 }
        		 break;
        		 
        	 case 4:
        		System.out.print("Enter empid = ");
 				int empid = new Scanner(System.in).nextInt();
 				for(Main x:marr) {
 					if( x instanceof Employee) {
 						Employee e = (Employee) x;
 						if(e.getEmpid() == empid) {
 							e.display();
 						}
 					}
 				}
 				break;
        	 case 5:
        		 System.out.print("Enter studentid= ");
  				int sid = new Scanner(System.in).nextInt();
  				for(Main x:marr) {
  					if(x instanceof Student && ((Student)x).getSid()==sid) {
  						Student s = (Student) x;
  						//if(s.getSid() == sid) {
  							s.display();
  						//}
  					}
  				}
  				break;
        	 case 6:
        		 m=new Employee();
        		 break;
        	 case 7:
        		 m=new Student();
        		 break;
        	 
        	 }
        	 
    		 if(m!=null) {
    			 m.acceptData();
    			// marr[index++]=m;
    			 marr.add(m);
    			 m=null;
    		 }
    		 
        	 
         }

	}

}
