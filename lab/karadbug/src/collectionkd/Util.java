package collectionkd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static Date toDate(String s) {
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}

	public static String toString(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(d);
		return s;
	}
}
