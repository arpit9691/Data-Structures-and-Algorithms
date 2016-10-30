import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 */

/**
 * @author Arpit
 *
 */
public class MostRepetativeString {

	/**
	 * @param args
	 */
	
	public static String[] RepetativeString(String[] S)
	{
		String[] a = new String[1000];
		int max =0;
		String max_key =null;
		if(S.length == 0)
		{
			return null;
		}
		if(S.length == 1)
		{
			a[0] = S[0];
			return a;
		}
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(int i=0;i<S.length;i++)
		{
			if(hm.containsKey(S[i]))
			{
				int value = hm.get(S[i]);
				hm.put(S[i], value+1);
				if(value>max)
				{
					max = value;
					a[i] = S[i];
				}
				
			}
			else
			{
				hm.put(S[i], 1);
			}
		}
		
		//String s = 
		
		
		/*int i=0;
		
		for(Entry<String,Integer> entry : hm.entrySet())
		{
			if(entry.getValue() > max)
			{
				max = entry.getValue();
			}
			
			a[i] = entry.getKey();
			i++;
		}*/
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] newString = {"apple","banana","apple","banana","apple","banana"};
		
		//String s = RepetativeString(newString);
		//System.out.println(s);
		
		String[] s = RepetativeString(newString);
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}
		
	}

}
