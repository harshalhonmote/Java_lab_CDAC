package optAssignment;

import java.util.Scanner;

public class Test {

	static int menu() {
		System.out.println("1.Choose Fixed Stack");
		System.out.println("2.Choose Grow Stack");
		System.out.println("3.Push Emp");
		System.out.println("4.Pop Emp");
		System.out.println("5.DISPLAY");
		System.out.println("6.EXIT");
		System.out.print("ENTER CHOICE:");
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
		int choice,flag=0;
		Employee e=null;
		StackInterface si =null;
		while((choice = menu()) !=6) {
			switch(choice) {
			case 1:
				if(flag == 0)si = new FixedStack();
				else System.out.println("YOU CAN'T CHOOSE ANOTHER STACK!!");
				 flag=1;
				 break;
			case 2:
				if(flag == 0)si = new GrowStack();
				else System.out.println("YOU CAN'T CHOOSE ANOTHER STACK!!");
				 flag=1;
				 break;
			case 3:
				if(flag == 1) {
					e = new Employee();
					e.acceptData();
					si.push(e);
					break;
				}
				else System.out.println("PLEASE CHOOSE STACK FIRST");
				
			case 4:
				//e = new Employee();
				//e.acceptData();
				if(flag == 1)si.pop();
				else System.out.println("PLEASE CHOOSE STACK FIRST");
				break;
			case 5:
				if( si instanceof FixedStack) {
					for(int i=0;i< FixedStack.arrFixed.length;++i) {
						if(FixedStack.arrFixed[i] != null){
							//FixedStack f = (FixedStack)si;
							Employee ee = FixedStack.arrFixed[i];
							System.out.println(ee);
						}
					}
				}
				else {
					for(int i=0;i< GrowStack.arrGrow.length;++i) {
						if(GrowStack.arrGrow[i] != null){
							Employee ee = GrowStack.arrGrow[i];
							System.out.println(ee);
						}
					}
				}
			}
		}
		

	}

}
