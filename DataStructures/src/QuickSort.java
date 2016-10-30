
public class QuickSort {
	
	public static int partition(int[] A,int start,int end)
	{
		int pivot = A[end];
		int pIndex = start;
		
		for(int i =start;i<end;i++)
		{
			if(A[i]<=pivot)
			{
				int temp = A[pIndex];
				A[pIndex]=A[i];
				A[i]=temp;
				pIndex++;
			}
		}
		int temp = A[pIndex];
		A[pIndex]=A[end];
		A[end] = temp;
		return pIndex;
	}
	
	public static int[] quickSort(int[] A,int start,int end)
	{
		if(start<end)
		{
			int pIndex = partition(A,start,end);
			quickSort(A,start,pIndex-1);
			quickSort(A,pIndex+1,end);
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,6,5,4,3,2,1};
		
		int b[]=quickSort(a,0,6);
		for(int i=0;i<7;i++)
		{
			System.out.println(b[i]);
		}

	}

}
