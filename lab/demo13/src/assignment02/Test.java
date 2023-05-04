package assignment02;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/*
		 ** LinkedHashSet<>-------------------------------
		 * Set<Book> set = new LinkedHashSet<>();
		 * o/p before Overriding HashCode() & equal()->order based as per your inserting order.
		 * o/p afther Overriding HashCode() & equal()->order based as per your inserting order
		 * By Default Object Class HashCode() & equal() method used to Avoid duplicates - based on (NEW) address.
		 * You have to write override HashCode() & equal() method for user defined classes to tell on which basis duplicates will supressed.
		 * 
		 */	
				 Set<Book> set = new LinkedHashSet<>();	
				 
				 set.add(new Book("11",20,"AAA",2));
				 set.add(new Book("33",50,"DDD",5));
				 set.add(new Book("22",30,"BBB",3));
				 set.add(new Book("44",70,"ZZZ",1));
				 set.add(new Book("55",90,"CCC",9));
				 set.add(new Book("44",70,"XXX",1));
		         
				 set.forEach(e->System.out.println(e));
	}

}
