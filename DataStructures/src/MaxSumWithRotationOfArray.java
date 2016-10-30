


public class MaxSumWithRotationOfArray {
	
	public static int max_sum(int A[], int n)
    {
	int sum=0;
	int maxSum=calculateSum(A,A.length);
	
	for(int j=0;j<A.length-1;j++)
	{
		int temp=A[0];
	    int k=1;
	    while(k<n)
	    {
	        A[k-1]=A[k];
	        k++;
	    }
	    A[k-1]=temp;
	    sum=calculateSum(A,A.length);
	    maxSum=Math.max(maxSum,sum);
	    sum=0;
	}
	return maxSum;
    }
	
	public static int calculateSum(int[] a,int n)
	{
		int sum=0;int i=0;
		while(i<n)
		{
		    sum=sum+i*a[i];
		    i++;
		}
		
		
		return sum;
	}
	
	public static int calculateMaxSum(int[] a)
	{
		int maxSum=0;
		int cummulativeSum=0;
		int currentSum=0;
		int nextSum=0;
		
		for(int i=0;i<a.length;i++)
		{
			cummulativeSum+=a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			currentSum+=i*a[i];
		}
		
		maxSum=currentSum;
		
		for(int i=0;i<a.length-1;i++)
		{
			nextSum=currentSum-(cummulativeSum-a[i])+a[i]*(a.length-1);
			currentSum=nextSum;
			
			maxSum=Math.max(maxSum, nextSum);
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int length=scanner.nextInt();
        int[] A = new int[length];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }*/
		int[] A={8,3,1,2};
        //int result=max_sum(A,4);
		int result=calculateMaxSum(A);
        System.out.println(result);

	}

}
