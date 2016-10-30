import java.util.*;
import java.util.Map.Entry;


public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdab"; char[] a = s.toCharArray();
		String str = "bcaadb"; char[] b = str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int value = hm.get(a[i]);
				hm.put(a[i], value+1);
			}
			else
			{
				hm.put(a[i], 1);
			}
		}
		
		for(int i =0;i<b.length;i++)
		{
			
			if(hm.containsKey(b[i]))
			{
				int value = hm.get(b[i]);
				if(value>0)
				{
					value--;
					hm.put(b[i],value);
				}
			}
		}
		
		for(Entry<Character, Integer> entry : hm.entrySet())
		{
			if(entry.getValue()>0)
			{
				System.out.println("False");
			}
			else
			{
				System.out.println("True");
			}
		}
		
	/*	Arrays.sort(a);
		Arrays.sort(b);
		
		if(s.length() != str.length())
		{
			System.out.println("False");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != b[i])
			{
				System.out.println("False");
			}
		}
		
		System.out.println("True");
		*/

	}

}
