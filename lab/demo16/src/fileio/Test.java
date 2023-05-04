package fileio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static final String MOVIE_FILE = "movies";
	
	public static void main(String[] args) {
		write();
	}
  
	public static void write() {
		List<Book> list = new ArrayList<>();
		Collections.addAll(list, new Book("BK11",22,"AAA",2),new Book("BK11",22,"AAA",2),new Book("BK11",22,"AAA",2));
		
		try(FileOutputStream out = new FileOutputStream(MOVIE_FILE)){
			try(DataOutputStream d = new DataOutputStream(out)){
				for(Book b : list) {
					d.writeUTF(b.getIsbn());
					d.writeDouble(b.getPrice());
					d.writeUTF(b.getaName());
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
