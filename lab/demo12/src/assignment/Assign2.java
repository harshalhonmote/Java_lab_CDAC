package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("1234");
        list.add("1234567");
        list.add("1234");
        list.add("1234569999");
        
        String i= Collections.max(list, (x,y)->x.length()-y.length());
        System.out.println(i);
        
	}

}
