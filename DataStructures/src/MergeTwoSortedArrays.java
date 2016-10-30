
public class MergeTwoSortedArrays {
	
	public static int[] merge(int[] a,int[] b)
	{
		int index=b.length-1;
		int index_a=a.length-1;
		int index_b=index-index_a-1;
		
		while(index_a>=0)
		{
			if(index_b<0 || a[index_a]>b[index_b])
			{
				b[index]=a[index_a];
				index_a--;
			}
			else
			{
				b[index]=b[index_b];
				index_b--;
			}
			index--;
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,3,8,9};
		int[] b={2,5,6,7,10,0,0,0,0};
		int[] c=merge(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
