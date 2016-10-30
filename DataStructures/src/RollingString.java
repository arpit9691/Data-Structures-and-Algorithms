/**
 * Created by Arpit on 9/27/2016.
 */
public class RollingString {

    public static void main(String args[])
    {
        String s="abc   ";
        String[] operation={"0 0 L","2 2 L","0 2 R"};
        char[] c=s.toCharArray();
        for(int i=0;i<operation.length;i++)
        {
            String[] temp=operation[i].split(" ");
            int l=Integer.parseInt(temp[0]);
            int r=Integer.parseInt(temp[1]);
            String op=temp[2];

            if(op.intern()=="R")
            {
                for(int k=l;k<=r;k++)
                {
                    if(c[k]=='z')
                    {
                        c[k]='a';
                    }
                    else
                    {
                        c[k]++;
                    }
                }
            }
            else if(op.intern()=="L")
            {
                for(int k=l;k<=r;k++)
                {
                    if(c[k]=='a')
                    {
                        c[k]='z';
                    }
                    else
                    {
                        c[k]--;
                    }
                }
            }


        }
        //System.out.println(c.toString());
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
