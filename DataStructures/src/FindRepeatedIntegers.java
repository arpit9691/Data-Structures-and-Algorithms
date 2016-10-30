import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit on 9/18/2016.
 */
public class FindRepeatedIntegers {

    public static void findAllRepeatedElements(int[] a)
    {
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();


        for(int i=0;i<a.length;i++)
        {
           if(list2.contains(a[i]))
           {
               continue;
           }
            else if(list.contains(a[i]))
           {

               list2.add(a[i]);
               System.out.println(a[i]);
           }
            else
           {
               list.add(a[i]);
           }
        }

    }


    public static void main(String args[])
    {
        int[] a={5,1,1,8,4,3,5,7,1,6,5,4,9,2};
       findAllRepeatedElements(a);


    }
}
