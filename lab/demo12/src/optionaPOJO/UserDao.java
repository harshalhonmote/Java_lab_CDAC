package optionaPOJO;

public class UserDao {
	UserDao uDao;
	public User findById(int userId) {
		for(User e : Dbutil.ulist) {
			if(e.getId() == userId) {
				return e;
			}
		}
		return null;
	}
	
	public User findByEmail(String email) {
	    return null;
	}
	
	public User findByEmailAndPassword(String email, String password) {
	     
		for(User e : Dbutil.ulist) {
			if(e.getEmail().equals(email) && e.getPasswd().equals(password)) {
				return e;
			}
		}
		return null;
		
	}
	
	public void addUser(User u) {
		 User temp;
		 if((temp = uDao.findByEmailAndPassword(u.getEmail(), u.getPasswd())) != null)
	      Dbutil.ulist.add(u);
		 else System.out.println("USER ALREADY PRESENT!!");
	}
	
	public void updateUser(User u) {
	      
	}
	
}
