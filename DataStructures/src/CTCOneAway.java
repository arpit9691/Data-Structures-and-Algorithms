/**
 * Created by Arpit on 10/16/2016.
 */
public class CTCOneAway {

    public static boolean checkStringEdits(String s1,String s2)
    {
        if(Math.abs(s1.length()-s2.length())>1)
        {
            return false;
        }

        if(s1.length()==s2.length())
        {
            boolean res=false;

            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    if(res)
                    {
                        return false;
                    }
                    res=true;
                }
            }

        }

        if(s1.length()!=s2.length())
        {
            String shorter=s1.length()<s2.length()?s1:s2;
            String longer=s1.length()>s2.length()?s1:s2;
            int index1=0;int index2=0;
            while(index1<longer.length() && index2<shorter.length())
            {
                if(longer.charAt(index1)!=shorter.charAt(index2))
                {
                    if(index1!=index2)
                    {
                        return false;
                    }

                    index1++;
                }
                else
                {
                    index1++;
                    index2++;
                }
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        System.out.println(checkStringEdits("abc", "bc"));
    }
}
