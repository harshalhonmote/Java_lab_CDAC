package inheritance;

class Bank{
	private final int accountNo;//
	String name;
	static int no;
	
	static {
		no=1000;
	}
	Bank(){
		this.accountNo=++no;
		this.name="AAA";
	}
	void display() {
		System.out.println(this.accountNo+" "+this.name);
	}
}

class Circle{
	private final static double pi=3.14;//not change in any obj (thats why static final)
	
	void display() {
		System.out.println(pi);
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
//		Bank b= new Bank();
//		b.display();
//		Bank b1= new Bank();
//        b1.display();
//-----------------------------------
        Circle c= new Circle();
        c.display();
	}

}
