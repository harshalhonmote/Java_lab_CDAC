package assignment03;

import java.util.TreeSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/*
		 ** TreeSet<>--Natural Ordering---Comparable--or pass comparator to constructor------------
		 * Set<Book> set = new TreeSet<>();
		 * ""NO NEED OF Hashcode() & equal()""
		 * --o/p before overriding comparable->"java.lang.ClassCastException" occur for user defined classes 
		 * bcoz Treeset implements comparable interface and your class has not implemented comparable interface then while natural ordering comparing exception occur bcoz different(comparable == Book)     
		 *  & for Primitive type it follows natural ordering of that class.eg. String -Alphabetical order defined in string class comparable
		 * --o/p afther Overriding Comparable->sorted order base on (overrided)comparable-->Duplicates avoided  
		 * But when you pass comparator then comparable logic not cosidered.
		 * Based on comparator logic duplicates are avoided and sorted.
		 */	
				 //Set<Book> set = new TreeSet<>((x,y)->-Double.compare(x.getPrice(),y.getPrice()));	
				 Set<Book> set = new TreeSet<>();
				 set.add(new Book("11",20,"AAA",2));
				 set.add(new Book("33",50,"DDD",5));
				 set.add(new Book("22",30,"BBB",3));
				 set.add(new Book("44",70,"ZZZ",1));
				 set.add(new Book("55",90,"CCC",9));
				 set.add(new Book("44",70,"XXX",1));
		         
				 set.forEach(e->System.out.println(e));

	}

}
