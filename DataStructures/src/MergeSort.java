
public class MergeSort {
	
	public static int[] merge(int[] L,int[] R,int[] A)
	{
		int n=A.length;
		int nl=L.length;
		int rl = R.length;
		int i = 0,j = 0,k=0;
		
		while(i<nl && j<rl)
		{
			if(L[i]<=R[j])
			{
				A[k]=L[i];
				i++;
			}
			else
			{
				A[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<nl)
		{
			A[k]=L[i];
			i++;
			k++;
		}
		while(j<rl)
		{
			A[k]=R[j];
			j++;
			k++;
		}
		
		return A;
	}
	
	public static int[] mergeSort(int[] A)
	{
		int n=A.length;
		int mid=n/2;
		int[] L=new int[mid];
		int[] R=new int[n-mid];
		if(n<2)
		{
			return A;
		}
		else
		{
		for(int i=0;i<mid;i++)
		{
			L[i]=A[i];
		}
		for(int j=mid;j<n;j++)
		{
			R[j-mid]=A[j];
		}
		
		mergeSort(L);
		mergeSort(R);
		merge(L,R,A);
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={7,6,5,4,3,2,1};
		int[] B=mergeSort(A);
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]+" ");
		}

	}

}
