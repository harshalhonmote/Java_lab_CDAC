package aPracticeAll;

public class Palindrome {

	static void palin(String str) {
		int e=str.length()-1;
		int flag=0;
		for(int i=0;i<=e/2;++i) {
			if(str.charAt(i)!= str.charAt(e)) {
				System.out.println("not palindrome");
				flag=1;
				break;
			}
			e--;
		}
		if(flag==0)System.out.println("Palindrome");
	}
	
	static boolean palin1(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
			}
		return true;
	}
	
	static boolean palinInt(int n) {
		int sum=0;
		int num=n;
		while(n>0) {
			sum=sum*10+(n%10);
			n/=10;
		}
		if(num==sum)return true;
		else return false;
	}
	public static void main(String[] args) {
		String str="kanak";
		palin(str);
		System.out.println(palin1(str));
		System.out.println(palinInt(721));
	}

}
