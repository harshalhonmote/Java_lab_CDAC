package classwork;

interface ServiceList1{
	
}

class Demo1 implements ServiceList1{
	void acceptData(){
		if(this instanceof ServiceList1) {
			System.out.println("YES");
		}
		else 
			System.out.println("NO");
	}
	
}

public class MarkerInterface implements ServiceList1{
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.acceptData();
		
	}

}
