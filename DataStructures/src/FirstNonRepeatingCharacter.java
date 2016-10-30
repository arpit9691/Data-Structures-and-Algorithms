import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Arpit on 9/16/2016.
 */
public class FirstNonRepeatingCharacter {

    public static Character nonRepeatingCharacter(String str)
    {

        List<Character> list=new ArrayList<Character>();

        for(int i=0;i<str.length();i++)
        {

            if(list.contains(str.charAt(i)))
            {
                list.remove((Character)str.charAt(i));

            }
            else
            {
                list.add(str.charAt(i));
            }
        }

        return list.get(0);
    }



    public static void main(String args[])
    {
        String str="GeeksforGeeks";
        System.out.println(nonRepeatingCharacter(str));

    }
}
