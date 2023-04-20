package abstractClass;

import java.util.Scanner;

public class Rectangle extends Shape {
   private int l,b;
	@Override
	public void acceptData() {
		System.out.print("enter Lenghr:");
		this.l = new Scanner(System.in).nextInt();
		System.out.print("enter b:");
		this.b = new Scanner(System.in).nextInt();
	}

	@Override
	public void claArea() {
		System.out.println("Area of rect:"+ this.l*this.b);
		

	}

}
