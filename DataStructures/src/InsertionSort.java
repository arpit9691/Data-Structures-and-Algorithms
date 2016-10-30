 
public class InsertionSort {
	
	public static int[] insertionSort(int[] a,int n)
	{
		for(int i = 1;i<n;i++)
		{
			int value = a[i];
			int hole = i;
			while (hole > 0 && a[hole-1]>value)
			{
					a[hole]=a[hole-1];
					hole =hole-1;
			}
			a[hole]=value;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,5,4,3,2,1};
		
		int b[]=insertionSort(a,6);
		for(int i=0;i<6;i++)
		{
			System.out.println(b[i]);
		}

	}

}
