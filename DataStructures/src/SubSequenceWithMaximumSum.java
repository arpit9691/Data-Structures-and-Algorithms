
public class SubSequenceWithMaximumSum {
	
	public static int maxSubsequenceSum(int[] A)
	{
		int sum=0,maxsum=0;
		if(A==null)
		{
			return -1;
		}
		if(A.length==0)
		{
			return -1;
		}
		if(A.length==1)
		{
			return A[0];
		}
		for(int i=0;i<A.length;i++)
		{
			sum = sum +A[i];
			if(sum>maxsum)
			{
				maxsum=sum;
			}
			else if(sum<0)
			{
				sum=0;
			}
		}
		
		return maxsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A={2,-8,3,-2,4,-10};
		System.out.println(maxSubsequenceSum(A));

	}

}
