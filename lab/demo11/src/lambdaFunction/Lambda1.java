package lambdaFunction;

import java.util.Arrays;

public class Lambda1 {

	public static void main(String[] args) {
		Emp[] arr = new Emp[] {
				new Emp(4, "Bill", "Manager", "Acc", 40000.0),
				new Emp(8, "John", "Clerk", "Sales", 35000.0),
				new Emp(2, "Millar", "Salesman", "Sales", 32000.0),
				new Emp(3, "Steve", "Manager", "Sales", 65000.0),
				new Emp(9, "King", "Manager", "Research", 62000.0),
				new Emp(7, "James", "Clerk", "Research", 62000.0)
			};
		Arrays.sort(arr,(Emp e1,Emp e2)->{
		   int diff = e1.getName().compareTo(e2.getName());
		   return diff;
		});
		
		 Arrays.sort(arr,(e1,e2)-> Double.compare(e1.getSal(),e2.getSal()));
		 for(Emp e:arr) {
				System.out.println(e);
			}
	}

}
