package aPracticeAll;

public class Prime {
 
	static boolean prime(int n) {
		//if(n==0 || n==1)return true;
		for(int i=2;i<=n/2;++i) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
     public static void main(String []args) {
    	 int n=4;
    	 if(prime(n))System.out.println("PRIME");
    	 else System.out.println("NOT PRIME");
     }
}
