
public class ElementsClosestToZero {
	
	public static void elementsClosestZero(int[] a)
	{
		int minSum=Integer.MAX_VALUE, sum=0, min_i=0, min_j=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(Math.abs(sum)<Math.abs(minSum))
				{
					minSum=sum;
					min_i=i;
					min_j=j;
				}
			}
		}
		System.out.println("Two Elements:"+" "+a[min_i]+" "+a[min_j]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,60,-10,70,-80,85};
		elementsClosestZero(a);

	}

}
