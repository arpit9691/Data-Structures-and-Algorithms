import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit on 10/9/2016.
 */
public class LongestSubStringLengthWithNonRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {
        int length=s.length()-1;

        List<Character> list=new ArrayList<Character>();

        int j=1; int maxLength=0;
        for(int i=0;i<=length;i++)
        {
            list.add(s.charAt(i));
            j=i+1;
            while(j<=length)
            {

                if(!(list.contains(s.charAt(j))) && (s.charAt(i)!=s.charAt(j)))
                {
                    list.add(s.charAt(j));
                    j++;
                }
                else
                {
                    maxLength=Math.max(maxLength,list.size());
                    list.clear();
                    //list.add(s.charAt(j));
                    //j++;
                    break;

                }
            }
        }
        maxLength=Math.max(maxLength,list.size());
        if(maxLength==0)
        {
            return s.length();
        }
        else
        {
            return maxLength;
        }


    }
    public static void main(String args[])
    {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
