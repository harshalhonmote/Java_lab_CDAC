package assignment04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		//Collection<String> c = new ArrayList<>();
/*ArrayList:
 * Multiple null values allowed.
 */
//-----------------------------------------------
		//Collection<String> c = new LinkedList<>();
/*LinkedList:
 *  Multiple null values allowed.
 */
//------------------------------------------------		
		//Collection<String> c = new HashSet<>();
/*HashSet:
 * Null value allowed,Duplicate null Avoided,
 * means only one null value present in HashSet<>.
 */
//------------------------------------------------	
		Collection<String> c = new TreeSet<>();
/*TreeSet:
 * if you insert null value :NullPointerException
 */
//-----------------------------------------------
		c.add(null);
		c.add("A");
		c.add("B");
		c.add("C");
		
//		c.add(null);
//		c.add(null);
		c.forEach(System.out::println);
		//c.forEach(e->System.out.println(e));

	}

}
