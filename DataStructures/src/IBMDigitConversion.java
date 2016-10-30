/**
 * Created by Arpit on 10/22/2016.
 */
public class IBMDigitConversion {

    public static boolean checkNumber(int n,int p,int q)
    {
        int check=0;
        while(n!=0)
        {
            check=n%10;
            if(check==p || check==q)
            {
                return true;
            }
            n=n/10;
        }
        return false;
    }

    public static void main(String args[])
    {
        int n=20;
        int p=3;
        int q=4;
        StringBuilder str=new StringBuilder();
        for(int i=1;i<=20;i++)
        {
            if((i%p==0 || i%q==0) && checkNumber(i,p,q))
            {
               //System.out.print("OUTTHINK,");
                str.append("OUTTHINK,");
            }
            else if(i%p==0 || i%q==0)
            {
                //System.out.print("OUT,");
                str.append("OUT,");
            }
            else if(checkNumber(i,p,q))
            {
                //System.out.print("THINK,");
                str.append("THINK,");
            }
            else {
                //System.out.print(i+",");
                str.append(i+",");
            }
        }
        int pos=str.lastIndexOf(",");
        String final1=str.substring(0,pos-1);
        System.out.println(final1);
    }
}
