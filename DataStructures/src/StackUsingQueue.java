import java.util.*;
import java.util.LinkedList;

/**
 * Created by Arpit on 9/21/2016.
 */
public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueue()
    {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
    }

    public void push(int n)
    {
        q1.add(n);
    }


    public int pop()
    {
        int temp=0;

        if(q1.size()==0)
        {
            System.out.println("empty Queue");
            return temp;
        }
        for(int i=0;i< q1.size()-1;i++)
        {
            q2.add(q1.remove());
        }
        temp=q1.poll();

        q1=q2;
        return temp;
    }
    public static void main(String args[])
    {

        StackUsingQueue s=new StackUsingQueue();
        s.push(5);
        s.push(10);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());



    }
}
