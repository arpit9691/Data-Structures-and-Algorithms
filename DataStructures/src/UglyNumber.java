/**
 * Created by Arpit on 10/3/2016.
 */
public class UglyNumber {

    public static void main(String args[])
    {
        int a=7;

        if(a%2==0)
        {
            a=a/2;
            if(a==1)
            {
                System.out.println("Done");

            }
            else if(a%3==0)
            {
                a=a/3;
                if(a==1)
                {
                    System.out.println("Done");
                }
            }
            else if(a%5==0)
            {
                a=a/5;
                if(a==1)
                {
                    System.out.println("Done");
                }
            }
        }
        else
        {
            System.out.println("Not possible");
        }
    }
}
