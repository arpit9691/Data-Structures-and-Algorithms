
public class MergeSorting {
	
	public static int[] merge(int[] L,int[] R,int[] A){
		
		int Nl = L.length;
		int Nr = R.length;
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<Nl && j<Nr)
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
		while(i<Nl)
		{
			A[k]=L[i];
			i++;
			k++;
		}
		while(j<Nr)
		{
			A[k]=L[j];
			j++;
			k++;
		}
		
		return A;
		
	}
	
	public static int[] mergeSort(int[] A)
	{
		//System.out.println(A.length);
		int n = A.length;
		int mid = n/2;
		int[] L = new int[mid];
		int[] R = new int[n-mid] ;
		if(n<2){
	
			return A;
		}
		else
		{
			
			for(int i =0;i<mid;i++)
			{
				L[i] = A[i];
				//System.out.println("hi:"+L[i]);
			}
			//System.out.println("mid:"+mid+" "+"R:"+R.length);
			for(int j =mid;j<A.length;j++)
			{
				
				R[j-mid]=A[j];
				//System.out.println("bye:"+R[j-mid]);
			}
			
			
			
			mergeSort(L);
			mergeSort(R);
			merge(L,R,A);
			
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a[] = {7,6,5,4,3,2,1};
				
				int b[]=mergeSort(a);
				for(int i=0;i<7;i++)
				{
					System.out.println(b[i]);
				}


	}

}
