package inheritance;

 class Base{
	 String s;
	Base(){
		System.out.println("Base class/parent Ctor:");
	}
	Base(String s){
		this.s=s;
	}
	void display() {
		System.out.println("BASE "+this.s);
	}
}

public class Inherit extends Base {
    int no;
	Inherit(String name, int no){
		super(name);
		this.no=no;
		System.out.println("subclass/child ctor:"+this.hashCode());
		
	}
	void display() {
		System.out.println("child "+this.no);
		super.display();
	}
	
	
	public static void main(String[] args) {
		Inherit i = new Inherit("AAA",1000);
		i.display();

	}

}
