package interfaceJava8;

interface Interface3{
	default void dispaly() {
		System.out.println("INDIDE INTERFACE 3");
	}
}

class Student1 {
	public void dispaly() {
		System.out.println("INSIDE CLASS STUDENT");
	}
}
class Student2 extends Student1 implements Interface3{
	
}
public class Test3 {

	public static void main(String[] args) {
		Interface3 s = new Student2();
		s.dispaly();

	}

}
