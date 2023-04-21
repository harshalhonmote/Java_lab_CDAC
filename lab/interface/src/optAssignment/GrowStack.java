package optAssignment;

public class GrowStack implements StackInterface{
	static Employee arrGrow[] = new Employee[3];
    static int topG;
    
    static {
    	topG=-1;
    }
	
	
	@Override
    public void push(Employee e) {
		if((GrowStack.arrGrow.length - 1) == GrowStack.topG+1) {
			System.out.println("*******");
			Employee temp[] = new Employee[GrowStack.arrGrow.length];
			for(int i=0;i<GrowStack.arrGrow.length;++i) {
				temp[i]=GrowStack.arrGrow[i];
			}
			GrowStack.arrGrow =new Employee[GrowStack.arrGrow.length + 3];
			for(int i=0;i<temp.length;++i) {
				GrowStack.arrGrow[i]=temp[i];
			}

		}
		//System.out.println("::"+GrowStack.topG+":"+GrowStack.arrGrow.length);
		System.out.println();
    	if(GrowStack.topG < GrowStack.arrGrow.length-1) {
    		GrowStack.arrGrow[++GrowStack.topG]=e;
    		System.out.println("EMP PUSHED");
    	}
    	System.out.println("::"+GrowStack.topG+":"+GrowStack.arrGrow.length);
    	
    }
     
     @Override
    public void pop() {
    	 if(GrowStack.topG >= 0) {
     		GrowStack.topG--;
     		System.out.println("EMP POPED");
     	}
     	else {
     		System.out.println("STACK IS EMPTY!!");
     	}
    	
    }
}
