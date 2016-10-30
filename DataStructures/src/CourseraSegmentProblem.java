import java.util.*;
import java.util.LinkedList;

/**
 * Created by Arpit on 9/23/2016.
 */
public class CourseraSegmentProblem {

    public static void main(String args[]) {
        int[] a = {5, 2, 1, 58, 9, 3, 7, 4};
        int min=Integer.MAX_VALUE;
        Deque<Integer> d = new LinkedList<Integer>();
        for (int i = 0; i < 2; i++) {
            while (!(d.isEmpty()) && a[i] >= a[d.getLast()]) {
                d.removeLast();
            }
            d.addLast(i);
        }

        for(int i=2;i<a.length;i++)
        {

            if(a[d.getFirst()]<min)
            {
                min=a[d.getFirst()];
            }
            while (!(d.isEmpty()) && a[i] >= a[d.getLast()]) {
                d.removeLast();
            }

            while (!(d.isEmpty()) && i-2 >= d.getFirst()) {
                d.removeFirst();
            }
            d.addLast(i);

        }
        if(a[d.getFirst()]<min)
        {
            min=a[d.getFirst()];
        }

        System.out.println(min);
    }
}
