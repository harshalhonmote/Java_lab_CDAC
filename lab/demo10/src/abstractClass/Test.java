package abstractClass;

public class Test <T extends Shape>{
	public T obj;
    Test(){
    
    }
//	public static int menu() {
//		System.out.println("----------------------");
//		System.out.println("0. Exit");
//		System.out.println("1. Area of Rectangle");
//		System.out.println("2. Area of Circle");
//		System.out.print("Enter choice = ");	
//		return new Scanner(System.in).nextInt();
//	}
	
	public static void main(String[] args) {
		Test<Circle>t1 = new Test<>();
		t1.obj.acceptData();
		
		Test<Rectangle>t2 = new Test<>();
		t2.obj.acceptData();
//	   Shape s =null;
//	   int choice;
//	   while((choice= Test.menu())!=0) {
//		   switch(choice) {
//		   case 1:
//			   s=new Rectangle();
//			  
//			   break;
//		   case 2:
//			   s= new Circle();
//			   break;
//		   }
//		   if(s != null) {
//			   s.acceptData();
//			   s.claArea();
//			   s=null;
//		   }
//		   
//		   
//	   }
	 
	}

}
