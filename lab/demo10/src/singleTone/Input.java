package singleTone;

import java.util.Scanner;

public class Input {
      private Scanner sc;//OR make static Scanner sc = new Scanner(System.in);
      private static Input in;
      
      private Input(){
    	  sc=new Scanner(System.in);
      }
      
      static {
    	  in = new Input();
      }
      
      public Scanner getSc() {
		return sc;
	}
      
	public static Input getIntance() {
		return in;
	}

	

	
}
