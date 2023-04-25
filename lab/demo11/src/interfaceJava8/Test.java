package interfaceJava8;

interface I1{
	void show();
/*
 * default method may or may not be override by inherited class
 * if not overrided by class then default method of INTERFACE is called.
 * if overrided by class then class method called
 */
	default void display() {
		System.out.println("INSIDE INTERFACE I1");
	}
}

class Student implements I1{
	@Override
	public void show() {
		System.out.println("INSIDE SHOW STUDENT");	
	}
	 public void display() {
		System.out.println("INSIDE DISPLAY STUDENT");	
	};
}

public class Test {

	public static void main(String[] args) {
		I1 obj = new Student();
		obj.show();
		obj.display();//INTERFACE DEFAULT METHOD CALLED
	//afther default display method override in class
		obj.display();//STUDENT DEFAULT METHOD CALLED
		

	}

}
