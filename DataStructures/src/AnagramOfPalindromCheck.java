import java.util.*;
import java.util.Map.Entry;
public class AnagramOfPalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String inputString = "aaabbbb";
        int count=0;String ans="NO";
        if(inputString.length()<=0)
        {
                ans="NO";
        }
       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        
        for(int i=0;i<inputString.length();i++)
        {
            if(hm.containsKey(inputString.charAt(i)))
            {
                hm.put(inputString.charAt(i),hm.get(inputString.charAt(i))+1);    
            }
            else
            {
                hm.put(inputString.charAt(i),1);    
            }
        }
        System.out.println(hm.size());
        /*for(int i=0;i<inputString.length();i++)
        {
               if(hm.get(inputString.charAt(i))%2!=0)
               {
                    count++;    
               }
        }*/
        for(Entry<Character,Integer> entry : hm.entrySet())
		{
        	System.out.println(entry.getValue());
			if(entry.getValue()%2!=0)
			{
				count++;
			}
			
		}
        
        if(count<=1)
        {
                ans="YES";
        }
        
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        
    }
	}


