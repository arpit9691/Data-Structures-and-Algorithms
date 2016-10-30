import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit on 9/19/2016.
 */
public class HackerRankFinalDiscountedPrice {

    public static void main(String args[])
    {
        int[] a={5,1,3,4,6,2};
        //int[] a={1,3,3,2,5};
        int[] b=new int[a.length];


        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<=a[i])
                {

                    b[i]=a[j];
                    break;
                }
            }

        }


        int sum=0;
        for(int i=0;i<a.length;i++)
        {

            sum=sum+(a[i]-b[i]);
        }
        System.out.println(sum);
        for(int i=0;i<a.length;i++)
        {
            if(b[i]==0)
            {
                System.out.println(i);
            }
        }

    }
}
