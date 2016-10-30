import java.util.ArrayList;
import java.util.List;


public class MakeAnagrams {
	public static int numberOfCharactersToBeDeleted(String str1,String str2)
    {
        //int count=0;
        //HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        List<Character> list1=new ArrayList<Character>();
        List<Character> list2=new ArrayList<Character>();
        
        for(int i=0;i<str1.length();i++)
        {
                list1.add(new Character(str1.charAt(i)));
        }
        
        for(int i=0;i<str2.length();i++)
        {
            if(list1.contains(str2.charAt(i)))
            {
                list1.remove(new Character(str2.charAt(i)));
            }
            else
            {
                list2.add(new Character(str2.charAt(i)));    
            }
        }
        
        
        return list1.size()+list2.size();    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1="fcrxzwscanmligyxyvym";
	        String str2="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
	        System.out.println(numberOfCharactersToBeDeleted(str1,str2));
	}

}
