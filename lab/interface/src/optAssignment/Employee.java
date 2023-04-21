package optAssignment;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double sal;
    
    
	 
//	public Employee(int id, String name, double sal) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.sal = sal;
//	}

    void acceptData() {
    	System.out.print("Enter EMP ID:");
    	this.id = new Scanner(System.in).nextInt();
      	System.out.print("Enter EMP Name:");
    	this.name = new Scanner(System.in).next();
      	System.out.print("Enter EMP Sal:");
    	this.sal = new Scanner(System.in).nextDouble();
    }

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}



	public static void main(String[] args) {
		

	}

}
