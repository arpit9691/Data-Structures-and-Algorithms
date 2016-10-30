import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Arpit on 9/17/2016.
 */





public class HackerRankMinIndexDifference {

    public static void calculateMinDiff(List<Integer> list1,List<Integer> list2)
    {
        int minDifference=Integer.MAX_VALUE;
        int minElement=Integer.MAX_VALUE;
        int minIndex=Integer.MAX_VALUE;
        int count=0;
        List<Integer> list3=new ArrayList<Integer>();

        for(int i=0;i<list1.size();i++)
        {

            if(Math.abs(i-(list2.indexOf(list1.get(i))))<minDifference)
            {
                minDifference=Math.abs(i-(list2.indexOf(list1.get(i))));
                list3.clear();
                list3.add(list1.get(i));

            }

            else if(Math.abs(i-(list2.indexOf(list1.get(i))))==minDifference)
            {
                list3.add(list1.get(i));
            }
        }

        for(int i=0;i<list3.size();i++)
        {
            if(list3.get(i)<minElement)
            {
                minElement=list3.get(i);
            }
        }

        System.out.println(minElement);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //int[]x=new int[n];
        //int[]y=new int[n];
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            //x[i]=s.nextInt();
            list1.add(s.nextInt());
        }


        for (int i = 0; i < n; i++) {
            //y[i]=s.nextInt();
            list2.add(s.nextInt());
        }

        calculateMinDiff(list1,list2);

    }
}
