
public class RemoveDuplicatesFromArray {
	
	public static int removeDuplicates(int[] a)
	{
		int x1 = a[0];
		int x2= 1;
		
		for(int i=1;i<a.length;i++)
		{
			x1=x1^a[i];
		}
		
		for(int j=2;j<a.length;j++)
		{
			x2=x2^j;
		}
		
		return x1^x2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,4,5,6};
		int r=removeDuplicates(a);
		System.out.println(r);
	}

}
