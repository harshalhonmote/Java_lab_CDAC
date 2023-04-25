package memberClasses;

class Outer1{
	private int a=10;
	private static String b = "AAA";
	
	class Inner1{
		private  int a =20;
		private  String str="BBB";
		private final static String str1="CCC";//AS MICRO //BUT static not allowed
	
		public void display() {
			System.out.println("a="+a+"b="+b+"str="+str);//a=20b=AAAstr=BBB
			System.out.println("a="+Outer1.this.a+"b="+b+"str="+str);//a=10b=AAAstr=BBB


		}
	}
	public void show() {
		Inner1 i = new Inner1();
		System.out.println("a="+a+"b="+b+"str="+i.str);
	}
}


public class NonStaticClass {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 in = new Outer1().new Inner1();
		in.display();
        o.show();		

	}

}
