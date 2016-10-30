public class SelectionSort {

	public void selectionSort(int[] a1,int n, String h)
	{
		h="hi";
		for (int i=0; i<n-1;i++)
		{
			int iMin = i;
			for( int j=i+1;j<n;j++)
			{
				if(a1[j]<a1[iMin])
				{
					iMin = j;
				} 
			}
			int temp = a1[iMin];
			a1[iMin] = a1[i];
			a1[i]=temp;
			
		}
		System.out.println(h);
		//return a;
	}
	
	public void read(){
		int a[] = {100,66,57,56,50,2};
		String hi="bye";
		selectionSort(a,6,hi);
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println(hi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new SelectionSort().read();
	}

}
