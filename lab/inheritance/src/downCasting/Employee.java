package downCasting;

import java.util.Scanner;

public class Employee extends Main {
	private int empid;
	private String ename;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	void acceptData() {
	   System.out.print("Enter emp id:");
	   this.empid= new Scanner(System.in).nextInt();
	   System.out.print("Enter emp name:");
	   this.ename= new Scanner(System.in).next();
		super.acceptData();
	}
	
	@Override
	void displayData() {
		System.out.println("emp Name:"+this.ename);
		System.out.println("emp id:"+this.empid);
		super.displayData();
	}
	void display() {
		System.out.println("IN THE EMPLOYEE DISPAY:"+this.ename);
	}
	
	
}
