package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class Test {
 
	public static void main(String[] args) {
      List<Book> book = new ArrayList<>();		
      book.add(new Book("1111",20,"AAA",2));
      book.add(new Book("2222",30,"BBB",3));
      book.add(new Book("3333",50,"DDD",5));
      book.add(new Book("4444",70,"ZZZ",1));
      book.add(new Book("5555",90,"CCC",9));
      
      //1.add new book to list;
/*    
      System.out.print("Enter book ISBN No:");
      String isbn = new Scanner(System.in).next();
      System.out.print("Enter book price:");
      Double price = new Scanner(System.in).nextDouble();
      System.out.print("Enter Auther Name:");
      String name = new Scanner(System.in).next();
      System.out.print("Enter Quantity:");
      int qty = new Scanner(System.in).nextInt();
      Book b = new Book(isbn,price,name,qty);
      book.add(b);
      System.out.println();
      book.forEach((e) -> System.out.println(e));
*/
     //2. Display book in forward order
/*
      book.forEach((e) -> System.out.println(e));
      book.forEach(System.out::println);
      
      for(Book e : book) {
    	  System.out.println(e);
      }

      Iterator<Book> it = book.iterator();
      while(it.hasNext()) {
    	  System.out.println(it.next());
      }
*/      
     //3.Dispaly all the books in reverse order
/*
      ListIterator<Book> lit = book.listIterator(book.size());
      while(lit.hasPrevious()) {
    	  System.out.println(lit.previous());
      }
*/    
     //4.Search book with given ISBN
/*
      System.out.print("Enter ISBN:");
      String isbn = new Scanner(System.in).next();
      Book b = new Book();
      b.setIsbn(isbn);
      int index = book.indexOf(b);
      System.out.println(index);	
      
      for(Book b : book) {
    	  if(b.getIsbn().equals(isbn))
    		  System.out.println(b);
      }
 */
      //5.delete book at given index
      System.out.println("ENTER INDEX TO DELETE RECORD");
      //int index = new Scanner(System.in).nextInt();
      //book.remove(index);
     // book.forEach(e->System.out.println(e));
      
    //6.Sort ->price desc
      book.sort((x,y)-> -Double.compare(x.getPrice(),y.getPrice()));
      System.out.println();
      //book.forEach(e->System.out.println(e.getPrice()));
      
    //7.Replace book at given index with new book
/*
      System.out.print("Enter book ISBN No:");
      String isbn = new Scanner(System.in).next();
      System.out.print("Enter book price:");
      Double price = new Scanner(System.in).nextDouble();
      System.out.print("Enter Auther Name:");
      String name = new Scanner(System.in).next();
      System.out.print("Enter Quantity:");
      int qty = new Scanner(System.in).nextInt();
      Book b = new Book(isbn,price,name,qty);
      System.out.println("ENTER INDEX TO DELETE RECORD");
      int index = new Scanner(System.in).nextInt();
     
      book.set(index, b);
      book.forEach(e->System.out.println(e));
*/        
      //8.remove all book price >50 removeIf() 
      book.removeIf(e->e.getPrice()>50);
      book.forEach(e->System.out.println(e.getPrice()));
      
	}
	
     
}
