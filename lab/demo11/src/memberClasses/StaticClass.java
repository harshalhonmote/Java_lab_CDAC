package memberClasses;

class Outer{
	private static int a;
	private static String name;
	
	public Outer() {
		this.a = 200;
		this.name = "Harsh";
	}
	//Inner class --
	public static class Inner{
		private int a;
		private static String str;
		
		Inner(){
			this.a = 100;
			this.str = "AAA";
		}
		public void display() {
			System.out.println("a="+ a +" name="+name +" str="+str);//a=100 name=Harsh str=AAA
			System.out.println("a="+ Outer.a +" name="+name +" str="+str);//a=200 name=Harsh str=AAA
		}
		
	}//Inner End--
	public void show() {
		System.out.println("a="+ a +" name="+name +" str="+Inner.str);//access private "str" directly
	}
}

public class StaticClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		//Outer.Inner in = new Outer.Inner();
		new Outer.Inner().display();
		o.show();

	}

}
