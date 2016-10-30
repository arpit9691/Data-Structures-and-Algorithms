import java.util.*;

/**
 * Created by Arpit on 10/26/2016.
 */
public class GroupAnagrams {

    public static String[] groupAnagram(String[] st)
    {

        Map<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
        List<String> list=new ArrayList<String>();
        String sorted="";
        for(String s:st)
        {
            sorted= sort(s);
            if(hm.get(sorted)==null)
            {
                hm.put(sorted,new ArrayList<String>());
            }
            hm.get(sorted).add(s);
        }
        int index=0;
        for(String key:hm.keySet())
        {
            ArrayList<String> l=hm.get(key);

            for(String s:l)
            {
                st[index]=s;
                index++;
            }
        }
        return st;
    }

    public static String sort(String s)
    {
        char[] str=s.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }
    public static void main(String args[])
    {
        String[] st={"acre","abc","race","care","cba","a","aa","aa"};

        st=groupAnagram(st);

        for(String s:st)
        {
            System.out.println(s+" ");
        }

    }
}
