import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arpit on 10/15/2016.
 */
public class PermutationOfPalindrom {

    public static boolean checkPermutation(String str)
    {
        //Map<String,Integer> hm=new HashMap<String,Integer>();

        int[] a=new int[('z'-'a')+1];

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            a[str.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0 && a[i]%2!=0)
            {
                count++;
            }
        }


        return count<=1 ;
    }

    public static void main(String args[])
    {
        System.out.println(checkPermutation("tact coa"));
    }
}
