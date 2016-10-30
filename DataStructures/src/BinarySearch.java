
public class BinarySearch {

	public static int binarySearch(int[] A,int n,int x)
	{
		int start =0;
		int end = n-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if (x==A[mid])
			{
				return mid;
			}
			else if(x<A[mid])
			{
				//end = mid-1;
				start = mid+1;
			}
			else
			{
				//start = mid+1;
				end = mid-1;
			}
			}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,6,5,4,3,2,1};
		int index =binarySearch(a,7,3);
		System.out.println("element 3 is at"+" "+index);
		

	}

}
