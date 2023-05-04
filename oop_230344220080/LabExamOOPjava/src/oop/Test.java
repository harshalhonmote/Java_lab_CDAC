package oop;

import java.util.Scanner;

public class Test {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ProductServices p = new ProductServices();
		
//		System.out.println("1. EDUCATIONAL_TOYS");
//    	System.out.println("2. ELECTRONIC_TOYS");
//    	System.out.println("3. DOLL");
//    	System.out.println("4. SOUND_TOYS");
//    	System.out.println("5. SPINNING_TOYS");
		

		int ch = 1;
		while (ch != 0) {
			System.out.println("-----------------");
			System.out.println("1.add new product");
			System.out.println("2.search product");
			System.out.println("3.dispaly all product");
			System.out.println("4.dispaly count pending order");
			System.out.println("5.update order status to confirmed");
			System.out.println("6.sort product");
			System.out.print("enter choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				p.addProduct();
				break;
			case 2:
				p.searchProduct();
				break;
			case 3:
				p.displayProduct();
				break;
			case 4:
				p.pendingOrders();
				break;
			case 5:
			//	p.update();
				break;
			case 6:
				//p.sortProduct();
				break;	
			}
		}

	}

}
