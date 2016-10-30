/**
 * Created by Arpit on 10/4/2016.
 */
public class PowerOfFour {

    public static void main(String args[])
    {
        int n=8;

        if(n>2 && (n & (n-2))==0 || n==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
