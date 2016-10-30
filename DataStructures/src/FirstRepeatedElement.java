import java.util.HashMap;


public class FirstRepeatedElement {

	public static int firstRepeatedElement(int[] a)
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int max=Integer.MIN_VALUE;
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]) && hm.get(a[i])>0)
			{
				hm.put(a[i], -(hm.get(a[i])));
				if(hm.get(a[i])>max)
				{
					max=hm.get(a[i]);
				}
			}
			else if(hm.containsKey(a[i]) && hm.get(a[i])<0)
			{
				continue;
			}
			else
			{
				hm.put(a[i],i+1);
			}
		}
		
		return a[-(max+1)];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={3,2,1,1,1,1,1,2,2,3};
		int r=firstRepeatedElement(a);
		System.out.println(r);

	}

}
