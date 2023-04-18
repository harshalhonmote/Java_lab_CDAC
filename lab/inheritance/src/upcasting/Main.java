package upcasting;

import java.util.Scanner;

public class Main {
    private int no;
    private String name;
    
    void acceptData() {
 	   System.out.print("Enter main no:");
        this.no=new Scanner(System.in).nextInt();
        System.out.print("Enter main name:");
        this.name=new Scanner(System.in).nextLine();
 }
    void displayData() {
 	   System.out.println("main no :"+this.no);
 	   System.out.println("Name :"+this.name);
    }
    
	public static void main(String[] args) {
		int choice,index=0;
        Scanner sc=new Scanner(System.in);
        Main marr[] = new Main[3];
        Main m=null;
		do {
			System.out.println("0.EXIT");
			System.out.println("1.Student");
			System.out.println("2.EMP");
			System.out.println("3.MAIN");
			System.out.println("4.DISPLAY");
			System.out.print("ENTER CHOICE:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				break;
			case 1:
				m=new Student();
				break;
			case 2:
				m= new Emp();
				break;
			case 3:
				m= new Main();
				break;
			case 4:
				for(Main x:marr) {
					x.displayData();
				}
				break;
		    default :
		    	System.out.println("ENTER VALID CHOICE!!!");
		    	break;
		    	
			}
			if(index <3 && m!=null) {
				m.acceptData();
				marr[index]=m;
				index++;
				m=null;
			}
			
			
			
		}while(choice != 0);

	}

}
