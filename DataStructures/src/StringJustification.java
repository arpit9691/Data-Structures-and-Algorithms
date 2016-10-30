/**
 * Created by Arpit on 10/14/2016.
 */
public class StringJustification {

    public static String justifyString(String str,int len)
    {
        String[] a =str.split(" ");
        int spaceCount=a.length-1;
        int spaceToBeAdded=len-str.length();
        int space=0; int extra=0; StringBuffer s = new StringBuffer(len);
        if((spaceCount+spaceToBeAdded)%spaceCount==0){
            space=(spaceCount+spaceToBeAdded)/spaceCount;
        }
        else
        {
            space=(spaceCount+spaceToBeAdded)/spaceCount;
            extra=(spaceCount+spaceToBeAdded)%spaceCount;

        }

        for(int i=0;i<a.length-1;i++)
        {
            s.append(a[i]);
            for(int j=0;j<space;j++)
            {
                s.append("*");

            }
            if(extra!=0)
            {
                s.append("*");
                extra--;
            }
        }
        s.append(a[a.length-1]);
        return s.toString();
    }

    public static void main(String args[])
    {
        String test="The quick brown fox jumps over the lazy dog.";
        System.out.println((justifyString(test, 52)).length());
    }
}
