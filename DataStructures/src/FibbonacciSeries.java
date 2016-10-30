
public class FibbonacciSeries {
	
	public static int calculateFibbnacci(int n,int fibbo)
	{
		
		if(n==1 || n==2)
		{
			//fibbo=1;
			System.out.print(fibbo+" ");	
			return fibbo;
		}
		else
		{
			//System.out.print(fibbo+" ");
			fibbo=calculateFibbnacci(n-1,fibbo)+calculateFibbnacci(n-2,fibbo);
			//fibbo=fibbo+calculateFibbnacci(n-1, fibbo);
			System.out.print(fibbo+" ");
		}
		
		return fibbo;
		//return calculateFibbnacci(n-1,fibbo)+calculateFibbnacci(n-2,fibbo);
		
		
		//System.out.print(fibbo+" ");
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=15;
		/*for (int i=1;i<=n;i++)
		{
			if(calculateFibbnacci(i)<=30)
			{
			System.out.println(calculateFibbnacci(i)+" ");
			}
			else
			{
				
			}
		}*/
		calculateFibbnacci(5,1);
		//System.out.println(n);

	}

}
