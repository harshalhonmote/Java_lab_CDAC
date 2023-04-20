package aPracticeAll;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurances {

	public static void main(String[] args) {
		String str="AABBCCCTTTMOO";
		
		char s[]= str.toCharArray();
	    Map<Character,Integer>m = new HashMap<>();
	    for(char c : s) {
	    	if(m.containsKey(c))m.put(c, m.get(c)+1);
	    	else m.put(c, 1);
	    	
	    }
//-----------------------------------------------------------------
//	    for(int i=0;i<str.length();++i) {
//	    	if(m.containsKey(str.charAt(i))) {
//                  m.put(str.charAt(i), m.get(str.charAt(i))+1);  		
//	    	}
//	    	else {
//	    		m.put(str.charAt(i), 1);
//	    	}
//	    }
	    for(Map.Entry x:m.entrySet()) {
	    	System.out.println(x.getKey()+":"+ x.getValue());
	    }

	}

}
