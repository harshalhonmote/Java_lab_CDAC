package optionaPOJO;

public class User {
     private int id;
     private String firstName;
     private String lastName;
     private String email;
     private String passwd;
     private static int idNo;
    
     static {
    	 idNo=0;
    	
     }
     User() {
    	 this.id=++idNo;
     }
     
    
     
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", passwd=" + passwd + "]";
	}
     
     
     
}
