package optAssignment;

public class FixedStack implements StackInterface{
    static Employee arrFixed[];
    static int topF;
    
    static {
    	topF=-1;
    	arrFixed = new Employee[SIZE];
    }
	
	
	@Override
    public void push(Employee e) {
    	if(FixedStack.topF < SIZE-1) {
    		arrFixed[++FixedStack.topF]=e;
    		System.out.println("EMP PUSHED");
    	}
    	else {
    		System.out.println("STACK IS FULL!!");
    	}
    }
     
     @Override
    public void pop() {
    	if(FixedStack.topF >= 0) {
    		FixedStack.topF--;
    		System.out.println("EMP POPED");
    	}
    	else {
    		System.out.println("STACK IS EMPTY!!");
    	}
    	
    }
}
