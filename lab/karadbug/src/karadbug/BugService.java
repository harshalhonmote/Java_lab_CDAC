package karadbug;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BugService {
       BugDao bugDao;
       Bug bug;
       
       public BugService() {
		try {
			bug = new Bug();
			bugDao = new BugDao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       public void close() {
    	  bugDao.close();
       }
       
       public void addNewBug(){
    	   Scanner sc = new Scanner(System.in);
    	   Bug b = new Bug();
    	   System.out.print("Enter title:");
    	   b.setTitle(sc.nextLine());
    	   System.out.print("Enter Description:");
    	   b.setDescription(sc.nextLine());
    	   System.out.print("Enter Status:");
    	   b.setStatus(sc.nextLine());
    	   System.out.print("Enter AssignedTo:");
    	   b.setAssignedTo(sc.nextInt());
    	   
    	   try {
			bugDao.addNewBug(b);
			System.out.println("Bug Saved.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	   
     }
       public void bugBugStatusClosed() {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter Bug id:");
    	   int bugId=sc.nextInt();
    	   
    	   int cnt = bugDao.bugBugStatusClosed(bugId);
    	   if(cnt == 1) {
    		  System.out.println("Done");
    	   }else {
    		   System.out.println("Already closed");
    	   }
       }
       
       public void openBugs() {
    	   Map<Bug,String> map = new HashMap<>();
    	   System.out.println("all open Bugs:");
    	   map = bugDao.openBugs();
    	   for(Entry<Bug, String> m: map.entrySet()) {
    		   Bug b = m.getKey();
    		   System.out.println(b+":"+m.getValue());
    	   }
       }
       public void openCount() {
    	   bugDao.openCount();
       }
	
}
