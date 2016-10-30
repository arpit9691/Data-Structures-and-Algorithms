import java.util.HashMap;




public class WordFrequecyList {
	
	public static void findFrequency(int[] a)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i =0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int value=hm.get(a[i]);
				hm.put(a[i],value+1);
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		
		for(java.util.Map.Entry<Integer, Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ={5,5,5,5,5,2,2,2,44,5,6,6,6,6,7,8,5,14,6};
		findFrequency(a);

	}

}
