package karadbug;

import java.io.PrintStream;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
       Date d = new Date();
       LocalDate date = LocalDate.now();
       long p = d.getTime();
      Timestamp t = new Timestamp(p);
        System.out.println(t.toLocalDateTime());
//------------------------------------------------------------
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		LocalDateTime localDateTime = timestamp.toLocalDateTime();
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.print("Con:" + localDate);
*/
//		Bug bc = new Bug(); 
//		bc.setCreated(DbUtil.TimestampTodate(new Timestamp(new Date().getTime())));
//		System.out.print(bc.getCreated());
		
		BugService bService = new BugService();
		//bService.addNewBug();
		//bService.bugBugStatusClosed();
		//bService.openBugs();
		//bService.openCount();
	    
//		String sql = "SELECT * FROM users WHERE id=?";
//		try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
//			stmt.setInt(1, userId);
//			ResultSet rs = stmt.executeQuery();
//			if(rs.next()) {
//				rs.updateString("passwd", newPassword);
//				rs.updateRow();
//				System.out.println("Password changed.");
//			}
//		}
		
//		Map<Integer,String>map = new HashMap<>();
//		map.put(1,"java");
//		map.put(2,"mmm");
//		map.put(3,"java");
//		map.put(4,"ttta");
//		map.put(5,"java");
//		map.put(6,"java");
//		System.out.println("Password changed.");
//		//String arr [] = new String[5]; 
//		Object arr [] = map.values().toArray();
//		
//		long cot =Stream.of(arr).filter(a->a.equals("java")).count();
//		System.out.println(cot);
		
	}

}