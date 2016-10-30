
public class BubbleSort {
	
	public static int[] bubbleSort(int a[],int n)
	{
		int flag=0;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					flag=1;
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			if(flag==0) break;
		}
		return a;
	}
	public static void main(String[] args) {
		
		int a[] = {6,5,4,3,2,1};
		
		int b[]=bubbleSort(a,6);
		for(int i=0;i<6;i++)
		{
			System.out.println(b[i]);
		}

		
		

	}

}
