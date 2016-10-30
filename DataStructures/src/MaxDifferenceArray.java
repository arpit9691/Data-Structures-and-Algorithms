
public class MaxDifferenceArray {

	public static int findMaxDifference(int[] a)
	{
		int minElement=a[0];
		int maxDiff=a[1]-a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]-minElement>maxDiff)
			{
				maxDiff=a[i]-minElement;
			}
			
			if(a[i]<minElement)
			{
				minElement=a[i];
			}
		}
		return maxDiff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2, 3, 10, 6, 4, 8, 1};
		System.out.println(findMaxDifference(a));
	}

}
