package sorting;

public class insertion {

	public static void main(String[] args) {
		int arr[]=new int[] {2,4,5,6,9,8};
		
		for(int i=1;i<arr.length;++i) {
			int j=i-1;
			int x=arr[i];
			while(x<arr[j] && j>=0) {
				arr[i]=arr[j];
				j--;
			}
			arr[j+1]=x;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
