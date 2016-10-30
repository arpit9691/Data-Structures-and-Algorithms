import java.util.*;
public class IntersectionOfTwoArray {

	public static ArrayList<Integer> findIntersection(int[] a,int[] b)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(hm.containsKey(b[i]))
			{
				int value=hm.get(b[i]);
				if(value>0)
				{
				result.add(b[i]);
				hm.put(b[i], value--);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,5,7,2,2};
		int[] b={1,2,3,2};
		
		ArrayList<Integer> a1 = findIntersection(a,b);
		
		for(int i:a1)
		{
			System.out.println(i);
		}
		

	}

}
