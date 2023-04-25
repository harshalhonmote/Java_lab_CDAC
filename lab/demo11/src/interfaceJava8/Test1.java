package interfaceJava8;

interface Inter1{
	//void show();
	default void display() {
		System.out.println("IN INTER 1");
	}
}
interface Inter2{
	//void show();
	default void display() {
		System.out.println("IN INTER 2");
	}
}

/*
class Employee implements Inter1,Inter2{
	//error MUST IMPLEMENT DEFAULT MEYHOD if same name in both interfaces
}
*/

class Employee1 implements Inter1,Inter2{
	public void display() {
		Inter1.super.display();//Inter 1 display
		Inter2.super.display();//Inter 2 display
		System.out.println("INSIDE DISPLAY EMP");
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		Inter1 emp = new Employee1();
		emp.display();

	}

}
