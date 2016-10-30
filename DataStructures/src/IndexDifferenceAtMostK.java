import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit on 10/20/2016.
 */
public class IndexDifferenceAtMostK {

    public static int differenceAtMostK(int[] a,int k)
    {
            int max=Integer.MIN_VALUE;int diff=0;
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<a.length;i++)
            {
                if(list.contains(a[i]))
                {
                    diff=i-list.lastIndexOf(a[i]);
                    if(diff<k && diff>max)
                    {
                        max=diff;
                    }

                }
                else
                {
                    list.add(a[i]);
                }
            }
            return max;
    }

    public static void main(String args[])
    {

    }
}
