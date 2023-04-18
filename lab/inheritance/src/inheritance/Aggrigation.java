package inheritance;


class First{
	private int no;
	private Aggrigation ag;
	
	public First(int no, Aggrigation ag) {
	     this.no=no;
	     this.ag=ag;
	}
	void demo() {
		System.out.println("in the first");
		this.ag.display();
	}
	
}

public class Aggrigation {
	 void display() {
		 System.out.println("IN THE DISPLAY OF AGG");
	 }

	public static void main(String[] args) {
		Aggrigation a = new Aggrigation();
		First f = new First(10,a);
		f.demo();
	}

}
