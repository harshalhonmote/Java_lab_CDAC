package exceptionHandling;

import java.util.Scanner;

class Test{
	void setSal(int sal) throws NegativeSalaryException {
		if(sal<0)throw new NegativeSalaryException();
		
	}
}

public class Demo {

	public static void main(String[] args) {
		System.out.print("enter :");
		int sal= new Scanner(System.in).nextInt();
		Test t = new Test();
		try {
			t.setSal(-12);
		}catch(NegativeSalaryException e) {
			e.getMsg();
		}
		
		
//--------------------------------------------------------------------
//		int arr[];
//		try {
//			System.out.print("enter :");
//			int n= new Scanner(System.in).nextInt();
//			arr = new int[n];
//			//arr[n]=20;
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		catch(NegativeArraySizeException e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("Finally");
//		}

	}

}
