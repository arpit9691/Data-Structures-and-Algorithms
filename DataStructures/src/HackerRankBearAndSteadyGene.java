import java.util.*;


public class HackerRankBearAndSteadyGene {

	public static int substringLength(String str)
	{
		int[] a = {0,0,0,0};
		int start=0,end=0;
		
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
				case 'A':
					a[0]++;
					if(a[0]%4==0 && start==0)
					{
						start=i+1;
						a[0]=0;
					}
					else
					{
						end=i+1;
					}
					break;
				case 'C':
					a[1]++;
					if(a[1]%4==0 && start==0)
					{
						start=i+1;
						a[1]=0;
					}
					else
					{
						end=i+1;
					}
					break;
				case 'G':
					a[2]++;
					if(a[2]%4==0 && start==0)
					{
						start=i+1;
						a[2]=0;
					}
					else
					{
						end=i+1;
					}
					break;
				case 'T':
					a[3]++;
					if(a[3]%4==0 && start==0)
					{
						start=i+1;
						a[3]=0;
					}
					else
					{
						end=i+1;
					}
					break;
			}
		}
		
		System.out.println(end+" "+start);
		
		return (end-start);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner=new Scanner(System.in);
		int n = 8;
		if(n%4==0)
		{
			String str="GAAATAAA";
			System.out.println(substringLength(str));
		}
		else
		{
			System.out.println("String length is not divisible by 4");
		}
	}

}
