package abstractClass;

import java.util.Scanner;

public class Circle extends Shape {
	private int r;

	@Override
	public void acceptData() {
		System.out.print("enter Radius");
		this.r = new Scanner(System.in).nextInt();
	}

	@Override
	public void claArea() {
		System.out.println("Area of Circle:"+(float)(3.14*this.r*this.r));
	}

}
