package aPracticeAll;

public class Amstrong {



	private static boolean amstrong(int n) {
		int i=3;
		int sum=0,temp=n;
		while(n>0) {
			int last=n%10;
			sum+= Math.pow(last,i);
			n/=10;
		}
		if(sum == temp)return true;
		else return false;
	}
	public static void main(String[] args) {
		int n=153;
		if(amstrong(n))System.out.println("YES");
		else System.out.println("NO");

	}

}
