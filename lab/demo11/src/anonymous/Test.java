package anonymous;

import java.util.Arrays;
import java.util.Comparator;



class Myclass{
	void display() {
		System.out.println("IN MYCLASS");
	}
}

public class Test {
	public static void main(String[] args) {
/*       
		class Inner extends Myclass{
			@Override
			void display() {
				System.out.println("IN INNER");
			}
		}
		Inner in = new Inner();
		in.display();
//class extends Myclass and has only one Method then why not make it ANONYMOUS CLASS;
*/
//--------------------------------------------------------------------------------------

		Myclass obj = new Myclass() {//Myclass obj = new Inner();--internally
		@Override //check override or not
		void display() {
			System.out.println("IN ANONYMOUS CLASS");
		}
	};
	obj.display();
	//((Myclass)obj).display();

//--------------------------comparator---------------------------------------------------
		Integer arr[]= {22,33,11,55,77,44};
/*		
		class SortArr implements Comparator<Integer>{//why creating class for only on method
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
*/	
/*		
		Comparator<Integer> obj = new Comparator<Integer>() {
			public int compare(Integer obj1, Integer obj2) {
				return obj1-obj2;
			}
		};
		Arrays.sort(arr, obj);
		for(int x:arr)System.out.println(x+" ");
*/		
//--------------------------------------------------------------------------------
// *****************ANONYMOUS OBJECT AND ANONYMOUS CLASS**********************
		
		Arrays.sort(arr,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1-o2);
			}
		});
		for(int x:arr)System.out.println(x+" ");
	
	
	}

}
