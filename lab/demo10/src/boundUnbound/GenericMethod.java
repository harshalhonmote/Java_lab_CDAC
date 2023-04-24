package boundUnbound;

public class GenericMethod {

	public <T extends Number> void swap(T a, T b) {//Generic Method
		T temp = a;
		a = b;
		b = temp;
		System.out.println(a +" "+b);
	}

	
	public static void main(String[] args) {
       GenericMethod g = new GenericMethod();
       g.swap(10, 12);
      // g.swap("z", "x");//error
		
	}

}
