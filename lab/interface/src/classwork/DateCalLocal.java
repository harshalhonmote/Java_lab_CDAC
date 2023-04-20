package classwork;

import java.util.Calendar;
import java.util.Date;

public class DateCalLocal {

	public static void main(String[] args) {
//		Date d = new Date();
//		String Words[] = (d.toString()).split(" ");
//        System.out.println(Words[2]);
	
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		
	}

}
