package objectClassMethod;

public class Test {
	
	public static void main(String []arg) {
		 Employee e1 = new Employee(11, "AAA");
	     Employee e2 = new Employee(11, "AAA");	
	     System.out.println(e1);
	     if(e1.equals(e2)) {
	    	 System.out.println("Equal");
	     }
	     else {
	    	 System.out.println("Not Equal");
	     }
		
	} 
}
