package classwork;

interface ServiceList{
	void display();
}
abstract class Demo implements ServiceList{
	
	void displayData() {
		System.out.println("DDDDDDDD");
	}
}
public class Main extends Demo{

	@Override
	public void display() {
		System.out.println("mmmmmm");
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.display();
		m.displayData();

	}

}
