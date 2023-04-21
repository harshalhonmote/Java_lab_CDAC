package classwork;

public class StringTemp {

	public static void main(String[] args) {
		String s1="pune";
		String s2="pune";
		String s3 = new String("pune");
		String s4 = new String("pune");
		
//		if(s1==s2)System.out.println("true");
//		else System.out.println("NO");
//		
//		if(s3==s4)System.out.println("true");
//		else System.out.println("NO");
//		
//		if(s1==s3)System.out.println("true");
//		else System.out.println("NO");
//		
//		if(s1.equals(s2))System.out.println("true");
//		else System.out.println("NO");
//		
//		if(s1.equals(s4))System.out.println("true");
//		else System.out.println("NO");
//		true
//		NO
//		NO
//		true
//		true
		StringBuilder s = new StringBuilder("pune");
		s.append("w");
		System.out.println(s);
		

	}

}
