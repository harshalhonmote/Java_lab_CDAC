package tester;

import java.util.Scanner;

import geometry.Point2D;

public class Test {
    static void dis(Point2D p[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER TWO POINTS :");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	if(p[a].isEqual(p[b])) {
    		System.out.println("BOTH POINTS ARE EQUAL");
    	}else {
    		float f= p[a].distance(p[b]);
    		System.out.println("DISTANCE :"+f);	
    	}
    	
    }
    
    static void point(Point2D p[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER POINT TO DISPLAY:");
    	int i=sc.nextInt();
    	System.out.println(p[i].getDetails());
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point2D p[] = new Point2D[3];
		for(int i=0;i<p.length;++i) {
			System.out.println("ENTER X & Y COR.:");
			p[i]=new Point2D(sc.nextInt(),sc.nextInt());
		}
		System.out.println("        x|y");
		for(Point2D x:p) {
			
			System.out.println(x.getDetails());
		}
		Test.dis(p);
		Test.point(p);
		
	}

}
