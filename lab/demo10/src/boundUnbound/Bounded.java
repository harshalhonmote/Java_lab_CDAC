package boundUnbound;

public class Bounded<T extends Number> {
	private T obj;
	private T obj1;
	private String s;
	
	Bounded(T obj){
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
   

	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	 public static void print(Bounded<?>b) {//not type safety
//		 public static void print(Bounded<? extends Number>b)upper-Bounded
//		 public static void print(Bounded<? super Number>b)lower-bound
	    	Object obj = b.getObj();
	    	String ss = b.getS();
	    	System.out.println(obj+" "+ss);
	    }
	
	 
	public static void main(String[] args) {
//		Bounded<Integer> b1 = new Bounded<>();
//		b1.setObj(11);
//		System.out.println(b1.getObj());
//		Bounded<String> b2 = new Bounded<>();
//		b2.setObj("DAC");
//		System.out.println(b2.getObj());
//		
		Bounded<Integer>b3= new Bounded<>(120);
		b3.setS("qqq");
		print(b3);

	}

}
