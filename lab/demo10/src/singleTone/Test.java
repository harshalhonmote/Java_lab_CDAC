package singleTone;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Input in = Input.getIntance();
		Scanner sc = in.getSc();
		System.out.println("enter value:");
		int n = sc.nextInt();
		System.out.println(n);

	}

}
