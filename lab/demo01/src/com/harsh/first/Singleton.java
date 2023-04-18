package com.harsh.first;

class First{
	private int num1;
	private String str;
	public static First f=null;
	
	private First() {
		num1=11;
		str="AAA";
	}
	public static First getRef() {
		if(f == null)f=new First();//CHECK FOR NULL
		return f; //RETURN COMMON REFERANCE
	}
	public void setTo(int num,String s) {
		this.num1=num;
		this.str=s;
	}
	public void getTo() {
		System.out.println(this.num1+" "+this.str);
	}
}

public class Singleton {

	public static void main(String[] args) {
		First f1= First.getRef();
        f1.getTo();
        First f2 = First.getRef();
        f2.setTo(33, "KKK");
        f2.getTo();
        f1.getTo();
	}

}
