package abstractClass;

public abstract class Shape {
    
	public abstract void acceptData();
	public abstract void claArea();
	
}
class Box<T extends Shape>{
	private  T obj;
	
	
	
	public static void main(String []arg) {
		Box<Circle>b1 = new Box<>();
		
	}
}