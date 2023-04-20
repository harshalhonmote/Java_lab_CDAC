package downCasting;

import java.util.Scanner;

public class Student extends Main {
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	void acceptData() {
	   System.out.print("Enter stu id:");
	   this.sid= new Scanner(System.in).nextInt();
	   System.out.print("Enter stu name:");
	   this.sname= new Scanner(System.in).next();
		super.acceptData();
	}
	
	@Override
	void displayData() {
		System.out.println("stu Name:"+this.sname);
		System.out.println("stu id:"+this.sid);
		super.displayData();
	}
	void display() {
		System.out.println("IN THE DISPALY STUDENT");
	}

}
