package objectClassMethod;

public class Employee {
    private int id;
    private String name;
    
    Employee(int id, String name){
    	this.id=id;
    	this.name=name;
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "employee"+this.id+" "+this.name;
    }
    @Override
    public boolean equals(Object obj) {//upcasting internally obj=emp;
    	if(obj!=null) {
    	Employee e = (Employee)obj;//downcasting
    	 return this.id==e.id;
    	}
    	return false;
    }
}
