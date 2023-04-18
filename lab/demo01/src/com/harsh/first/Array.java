package com.harsh.first;

import java.util.Scanner;

class Demo{
	private int id;
	private String name;
	
	void setTo(int id,String name) {
		this.id =id;
		this.name =name;
	}
	String getTo() {
		return (this.id+" "+this.name);
	}
}

public class Array {
      
	
	public static void main(String[] args) {
		Demo arr[]=new Demo[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;++i) {
			arr[i]=new Demo();
			System.out.println("Enter ID & NAME:");
			arr[i].setTo(sc.nextInt(), sc.next());
		}
		for(Demo d:arr) {
			System.out.println(d.getTo());
		}
     sc.close();
	}

}
