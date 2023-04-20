package classwork;

public class Clone implements Cloneable{
	private int x, y;

	public Clone(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.x+" "+this.y;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Clone c= new Clone(8000,9000);
		return c;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c1 = new Clone(2, 4);
		System.out.println("c1:"+c1);
		Clone c2=(Clone) c1.clone();
		//c2.x=333;
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);

	}

}
