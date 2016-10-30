import java.util.Arrays;

/**
 * Created by Arpit on 9/17/2016.
 */
public class FindRepeatedInteger {

    public static int findRepeatedElement(int[] a)
    {
        int count=1;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
                if(count>(a.length/2))
                {
                    return a[i];
                }
            }
            else
            {
                count=1;
            }


        }
        return 0;
    }

    public static void main(String args[])
    {
        int[] a ={6,6,2,2,2,2,4};
        System.out.println(findRepeatedElement(a));
    }
}
