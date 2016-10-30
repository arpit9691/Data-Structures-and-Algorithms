
public class CoinChangeProblem {
	
	public static int numberOfWays(int[] c,int amount)
	{
		int[][] result = new int[c.length+1][amount+1];
		
		for(int i=0;i<c.length;i++)
		{
			result[i][0]=1;
		}
		for(int j=1;j<amount;j++)
		{
			result[0][j]=0;
		}
		
		for(int i=1;i<=c.length;i++)
		{
			for(int j=1;j<=amount;j++)
			{
				if(c[i-1]<=j)
				{
					result[i][j]=result[i-1][j]+result[i][j-c[i-1]];
				}
				else
				{
					result[i][j]=result[i-1][j];
				}
			}
		}
		
		return result[c.length][amount];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] c = {1,2,3};
		int amount=4;
		int r=numberOfWays(c, amount);
		System.out.println(r);

	}

}
