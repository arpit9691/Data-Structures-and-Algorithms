
public class MaxSubsequenceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b = 0;
		int [] a1 = new int[]{-4,3,5,-2,-1,6,2,-2};
		for(int j=0;j<a1.length;j++)
		{
			b+=a1[j];
			if(b>a)
			{
				a=b;
				
			}
			else if(b<0) {
				b=0;
				
			}
			
			
		}
		System.out.println(a);

	}

}
