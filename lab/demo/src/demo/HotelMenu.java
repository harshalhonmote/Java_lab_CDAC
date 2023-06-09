package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Menu{
	Map<String, Integer> bill= new HashMap<String, Integer>();
	
	void generate_bill() {
		int total_bill=0;
		System.out.println("-----F I N A L  B I L L--------");
		for(Map.Entry<String, Integer> x:bill.entrySet()) {
			System.out.println(x.getKey()+" --- "+x.getValue());
			total_bill+=x.getValue();
		}
		System.out.println("TOTAL BILL :"+ total_bill+"/-");
		
	}
	
	void menu() {
		 int choice;
		 
		 Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---------------------");
			System.out.println("ENTER YOUR CHOICE:");
			System.out.println("0. EXIT");
			System.out.println("1. DOSA   -- 20/-");
			System.out.println("2. SAMOSA -- 30/-");
			System.out.println("3. BEER  --  FREE/-");
			System.out.println("4. SHOW ORDER ");
			System.out.println("---------------------");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				break;
			case 1:
				bill.put("DOSA", 20);
				System.out.println("--- "+bill.size()+" "+"ITEM ADDED");
				break;
			case 2:
				bill.put("SAMOSA", 30);
				System.out.println("--- "+bill.size()+" "+"ITEM ADDED");
				break;
			case 3:
				bill.put("BEER", 0);
				System.out.println("--- "+bill.size()+" "+"ITEM ADDED");
				break;
			case 4:
				System.out.println("******* ITEM LIST *********");
				int i=0;
				for(Map.Entry<String, Integer> x:bill.entrySet()) {
					if(x.getValue()==0) {
						System.out.println(i+" "+x.getKey()+" ---  FREE MAI");
					}else
					   System.out.println(i+" "+x.getKey()+" --- "+x.getValue());
					i++;
				}
				System.out.println("***********************");
				break;
			default:
				System.out.println("!!! ENTER VALID CHOICE");
			}
				
		}while(choice != 0);
	}
	
}

public class HotelMenu { 
	public static void main(String[] args) {
		Menu m = new Menu();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("------ PASHA DI ढाबा -----");
			System.out.println("ENTER YOUR CHOICE:");
			System.out.println("0. EXIT");
			System.out.println("1. MENU"); 
			System.out.println("2. GENERATE BILL");
			choice = sc.nextInt();
			System.out.println("---------------------------");
			switch(choice) {
			case 0:
				System.out.println(" THANK YOU ");
				System.out.println("---------------------------");
				break;
			case 1:
				m.menu();
				break;
			case 2:
				if(m.bill.size() == 0) {
					System.out.println("### PLEASE ORDER SOMETHING ###");
					System.out.println("---------------------------");
					break;
				}
				m.generate_bill();
				System.out.println("---------------------------");
				m.bill.clear();
				break;
			default :
				System.out.println(" !!! ENTER VALID CHOICE ");
				System.out.println("---------------------------");
				break;
			}
			
		}while(choice != 0);
	}

}
