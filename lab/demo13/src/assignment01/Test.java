package assignment01;


import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
/*
 ** HashSet<>-------------------------------
 * Set<Book> set = new HashSet<>();
 * o/p before Overriding HashCode() & equal()->random order based on Hash value.
 * o/p afther Overriding HashCode() & equal()->sorted order based on key(ISBN)
 * By Default Object Class HashCode() & equal() method used to Avoid duplicates - based on (NEW) address.
 * You have to write override HashCode() & equal() method for user defined classes to tell on which basis duplicates will supressed.
 * 
 */
		 Set<Book> set = new HashSet<>();	
		 
		set.add(new Book("11",20,"AAA",2));
		 set.add(new Book("22",30,"BBB",3));
		 set.add(new Book("33",50,"DDD",5));
		 set.add(new Book("44",70,"ZZZ",1));
		 set.add(new Book("55",90,"CCC",9));
		 set.add(new Book("44",70,"XXX",1));
         
		 set.forEach(e->System.out.println(e));
	}

}
