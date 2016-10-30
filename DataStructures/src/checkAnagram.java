import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class checkAnagram {

	public static int calculateOperations(String a)
	{
		if(a.length()%2!=0)
		{
			return -1;
		}
		String c="",d="";
		for(int i=0,j=a.length()/2;i<a.length()/2;i++,j++)
		{
			c=c+a.charAt(i);
			d=d+a.charAt(j);
		}
		System.out.println(c+" "+d);
		int count=0;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<d.length();i++)
		{
			if(hm.containsKey(d.charAt(i)))
			{
				hm.put(d.charAt(i), hm.get(d.charAt(i))+1);
			}
			else
			{
				hm.put(d.charAt(i), 1);
			}
		}
		
		for(int j=0;j<c.length();j++)
		{
			if(hm.containsKey(c.charAt(j)))
			{
				int value=hm.get(c.charAt(j));
				if(value>0)
				{
					value--;
					hm.put(c.charAt(j), value);
				}
				else
				{
					count++;
				}
				
				
			}
            else
            {
                count++;    
            }
		}
	
		return count;
	}
	
	public static boolean validateAnagram(String a,String b)
	{
		List<Character> list1=new ArrayList<Character>();
		List<Character> list2=new ArrayList<Character>();
		char c1,c2;
		boolean r=false;
		
		if(a.length()!=b.length())
		{
			return r;
		}
		
		for(int i=0,j=0;i<a.length();i++,j++)
		{
			c1=a.charAt(i);
			c2=b.charAt(j);
			if(c1==c2)
			{
				continue;
			}
			else
			{
				if(list1.contains(c2))
				{
					list1.remove(new Character(c2));
				}
				else
				{
					list2.add(new Character(c2));
				}
				if(list2.contains(c1))
				{
					list2.remove(new Character(c1));
				}
				else
				{
					list1.add(new Character(c1));
				}
			}
		}
		
		if(list1.size()==0 && list2.size()==0)
		{
			r=true;
		}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(calculateOperations("hhpddlnnsjfoyxpciioigvjqzfbpllssuj"));
		System.out.println(validateAnagram("acbb","bbaa"));

	}

}
