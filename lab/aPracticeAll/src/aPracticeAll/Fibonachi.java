package aPracticeAll;

public class Fibonachi {
	
	 static int fib(int n) {
		
		if(n<=1)return n;//imp
		
		return fib(n-1)+fib(n-2);
	}
	
	 static int fib1(int n) {
		 int a=0,b=1,c=0;
		 for(int i=2;i<=n;++i) {
			 c=a+b;
			 a=b;
			 b=c;
		 }
		 return b;
	 }
	 static int fib2(int n) {
		 int arr[]=new int[n+2];
		 arr[0]=0;
		 arr[1]=1;
		 for(int i=2;i<=n;++i) {
			 arr[i]= arr[i-1]+arr[i-2];
		 }
		 return arr[n];
		 
	 }
	public static void main(String []args) {
		int n=9;//34
		System.out.println(fib(n));
		System.out.println(fib1(n));
		System.out.println(fib2(n));
		
		
	}

}
