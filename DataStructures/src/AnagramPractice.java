import java.util.HashMap;


public class AnagramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Arpot"; char[] a1 = a.toCharArray();
		String b = "rpiAt"; char[] b1 = b.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		if(a.length()!=b.length() || a.length()<0 || b.length()<0)
		{
			System.out.println("Not Anagram");
		}
		
		for(int i=0;i<a1.length;i++)
		{
			if(hm.containsKey(a1[i]))
					{
						hm.put(a1[i], hm.get(a1[i])+1);
					}
			else
			{
				hm.put(a1[i], 1);
			}
		}
		
		for(int i=0;i<b1.length;i++)
		{
			if(hm.containsKey(b1[i]))
					{
						if(hm.get(b1[i])>0)
						{
							int value=hm.get(b1[i]);
							value--;
							hm.put(b1[i], value);
							
						}
						
					}
			
		}
		
		for(int i=0;i<a1.length;i++)
		{
			if(hm.get(a1[i])!=0)
			{
				System.out.println("False");
			}
			else
				continue;
			
		}
	
		

		
		

	}

}
