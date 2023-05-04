package oop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Product;
import validations.Validation;

public class ProductServices {
    ProductDao pdao;
    
    public ProductServices() {
		try {
			pdao = new ProductDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public int enumMenu() {
    	System.out.print("---- Product category ----");
    	System.out.println("1. EDUCATIONAL_TOYS");
    	System.out.println("2. ELECTRONIC_TOYS");
    	System.out.println("3. DOLL");
    	System.out.println("4. SOUND_TOYS");
    	System.out.println("5. SPINNING_TOYS");
    	System.out.print("Enter Product category :");
    	return Test.sc.nextInt();
    }
    
	public void addProduct() {
		Product p = new Product();
		
		System.out.print("Enter Product Name :");
		Test.sc.nextLine();
		String name = Test.sc.nextLine();
		if(Validation.productName(name)) {
			p.setName(name);
		}
		
		
		System.out.print("Enter Product category :");
		String category = Test.sc.nextLine();
		if(Validation.productCategory(Category.valueOf(category))) {
			p.setCategory(Category.valueOf(category));
		}
		
		System.out.print("Enter Product price :");
		Double price = Test.sc.nextDouble();
		if(Validation.priceNegative(price)) {
			p.setPrice(price);
		}
		
		System.out.print("Enter Product InStock (Y/N):");
		String inStock = Test.sc.next();
		if(inStock.equals("yes") || inStock.equals("y")) {
			p.setInstock(true);
		}else {
			p.setInstock(false);
		}
		
		int cnt = pdao.addProduct(p);
		
		if(cnt>0) {
			System.out.println("Product added");
		}
		else {
			System.out.println("not added");
		}
	}
	public void searchProduct(){
		List<Product>list = new ArrayList<>();
		System.out.print("Enter Product category :");
		Test.sc.nextLine();
		String category = Test.sc.nextLine();
		
		System.out.println("sss"+category);
		if(Validation.productCategory(Category.valueOf(category))) {
			list = pdao.searchProduct(category);
		}
		list.forEach(System.out::println);
		
	}
	
	public void displayProduct() {
		List<String[]>list = pdao.displayProduct();
		for(String[] s: list) {
			System.out.println(s[0]+":"+s[1]+":"+s[2]);
		}
	}
	
	public void pendingOrders() {
		List<String[]>list = pdao.pendingOrders();
		for(String[] s: list) {
			System.out.println(s[0]+":"+s[1]);
		}
	}
	
	
}
