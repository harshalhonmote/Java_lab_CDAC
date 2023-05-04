package karadbug;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BugDao {
    Connection con;
    PreparedStatement addNewBugStmt;
    PreparedStatement bugBugStatusClosedStmt;
    PreparedStatement checkBugStatusStmt;
    PreparedStatement openBugsStmt;
    CallableStatement openCountStmt;
    
     public BugDao() throws SQLException {
		con = DbUtil.getConnection();
		
		String addNewBugSql = "INSERT INTO bugs(title,description,status,assigned_to,created,modified) VALUES(?,?,?,?,?,?)";
		addNewBugStmt = con.prepareStatement(addNewBugSql);
		
		String bugBugStatusClosedSql = "UPDATE bugs SET status=?, modified=? WHERE id=?";
		bugBugStatusClosedStmt = con.prepareStatement(bugBugStatusClosedSql);
		String checkBugStatusSql = "SELECT status FROM bugs WHERE id =?";
		checkBugStatusStmt = con.prepareStatement(checkBugStatusSql);
		
		String openBugs = "select m.name,b.id,b.status,b.created from bugs b, members m where b.assigned_to = m.id and b.status=? order by b.created;";
		openBugsStmt = con.prepareStatement(openBugs);
		
		openCountStmt = con.prepareCall("call temp()");
		
		
	}
     
    public void close() {
    	try {
    		bugBugStatusClosedStmt.close();
    		checkBugStatusStmt.close();
    		addNewBugStmt.close();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
     
     public int addNewBug(Bug b) throws SQLException {
    	 int cnt;
         addNewBugStmt.setString(1, b.getTitle());	
         addNewBugStmt.setString(2,b.getDescription());
         addNewBugStmt.setString(3, b.getStatus());
         addNewBugStmt.setInt(4,b.getAssignedTo());
         
         //Timestamp t1 = new Timestamp(new Date().getTime());
         addNewBugStmt.setTimestamp(5,DbUtil.dateToTimestamp());
         
         //Timestamp t2 = new Timestamp(new Date().getTime());
         addNewBugStmt.setTimestamp(6,DbUtil.dateToTimestamp());
         
         cnt = addNewBugStmt.executeUpdate();
         return cnt;

	}
	
     public int bugBugStatusClosed(int bugId) {
    	 int cnt=0;
    	 try {
			checkBugStatusStmt.setInt(1, bugId);
			ResultSet rs = checkBugStatusStmt.executeQuery();
			
			String status;
			
			if(rs.next()) {
				status = rs.getString("status");
				
				if(status.equals("open")) {
					bugBugStatusClosedStmt.setString(1,"closed");
					bugBugStatusClosedStmt.setTimestamp(2, DbUtil.dateToTimestamp());
					bugBugStatusClosedStmt.setInt(3, bugId);
					
					cnt=bugBugStatusClosedStmt.executeUpdate();
					
				}
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	return cnt; 
     }
     
     public  Map<Bug,String> openBugs() {
    	 Map<Bug,String>  map = new HashMap<>();
    	 
    	 try {
			openBugsStmt.setString(1, "open");
			ResultSet rs= openBugsStmt.executeQuery();
			
			while(rs.next()) {
				Bug b= new Bug();
				
				String name = rs.getString(1);
				
				b.setId(rs.getInt(2));
				b.setStatus(rs.getString(3));
				b.setCreated(DbUtil.TimestampTodate(rs.getTimestamp(4)));
				
				map.put(b,name);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return map;
    	 
     }
     public void openCount() {
    	 try {
			ResultSet rs = openCountStmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1));
				System.out.println(" "+rs.getInt(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
     
     
     
     
     
     
     
     
     
     
}
