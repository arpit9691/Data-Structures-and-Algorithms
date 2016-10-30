
public class BinarySearchValue {

	public static boolean searchVal(int[] a,int n)
	{
		if(a==null || a.length==0)
		{
			return false;
		}
		int start=0;
		int end = a.length-1;
		int mid=0;
		
		
		while(start<end)
		{
			mid=(start+end)/2;
			if(a[mid]==n)
			{
				return true;
			}
			else if(n<a[mid])
			{
				end=mid-1;
			}
			else if(n>a[mid])
			{
				start=mid+1;
			}
			
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {};
		boolean res=searchVal(a, 3000);
		System.out.println(res);
		if(res)
		{
			System.out.println("done");
		}

	}

}
