package demo;

import java.util.Scanner;

public class Pattern {
    
	void pattern03() {
	  int r=0;
	  System.out.print("Enter rows:");
	  Scanner sc = new Scanner(System.in);
	  r = sc.nextInt();
	  for(int i=r;i>=0;--i) {
		  for(int j=i;j>=1;j--) {
			  System.out.print(" ");
		  }
		  for(int k=i;k<=r;k++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	}
	
	
	
	void pattern01() {
		for(int i=1;i<=5;++i) {
			for(int j=5-i;j>0;--j) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;++k) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	void pattern02() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;++k) {
				System.out.print("*");
			}
			System.out.println();
		}
		//--------------down--------------------
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=(5-i)*2-1;k>0;--k) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pattern p = new Pattern();
      //p.pattern03();
      //p.pattern01();
      p.pattern02();
	}

}
