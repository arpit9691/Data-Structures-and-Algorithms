import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit on 9/23/2016.
 */
public class HackerrankAirplane {

    public static void main(String args[])
    {
        String str="10U2RD2L";

        char[] c=str.toCharArray();
        List<String> list=new ArrayList<String>();




        for(int i=0;i<c.length;i++)
        {


            int temp=c[i];
            if(c[i]>=48 && c[i]<=57)

            if(!(temp>=65 && temp<=96))
            {

                String r=String.valueOf(c[i])+String.valueOf(c[i+1]);
                list.add(r);
                i++;
            }
            else
            {
                list.add(String.valueOf(c[i]));
            }
        }

        for(String s:list)
        {
            System.out.println(s);
        }


    }
}
