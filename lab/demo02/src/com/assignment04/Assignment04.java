package com.assignment04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment04 {

	static void countWords() {
		String str="aaa bbb ccc ddd";
		String words[]=str.split(" ");
		System.out.println(words.length);
//------------------------------------------------------
		StringTokenizer s= new StringTokenizer(str);
		int count=0;
		while(s.hasMoreTokens()) {
			count++;
			s.nextToken();
		}
		System.out.println(count);
	}
	
	static void palin() {
		String str="kanak";
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
//----------------------------------------------------------
//		int len = str.length();
//		for (int i = 0; i < len / 2; i++) {
//			if (str.charAt(i) != str.charAt(len - i - 1))
//				return false;
//			}
//		return true;
	}
	
	
	static void reverse() {
		String str="abcd";
		

		char s[]= str.toCharArray();
		for(int i=s.length-1;i>=0;--i) {
			System.out.print(s[i]);
		}

	    StringBuilder rev = new StringBuilder(str);
	    rev.reverse();
	    System.out.println(rev);
		
	}
	
	public static void main(String ...args) {
		//Assignment04.reverse();
		//Assignment04.palin();
		//Assignment04.countWords();
		Scanner sc = new Scanner(System.in);
		System.out.print("entrt1");
		String s1=sc.nextLine();
		int i=Integer.parseInt(sc.nextLine());
		System.out.print("enter2");
		//sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(s1+" "+s2+" "+i);
		sc.close();
       
	}

}
