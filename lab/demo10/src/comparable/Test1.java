package comparable;


class Demo{
	public <T extends Number> T minArray(T [] arr) {
	    T min = arr[0];
	    for(int i=1;i<arr.length;++i) {
	    	if(arr[i].intValue() < min.intValue()) {
	    		min = arr[i];
	    	}
	    }
	    //System.out.println(min);
	    return min;
	    
	}
}

public class Test1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		Integer arr[]= {7,9,2,4,5,6,8};
		System.out.println(d.minArray(arr));
	

	}

}
