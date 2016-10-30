import java.util.Stack;

/**
 * Created by Arpit on 10/28/2016.
 */
public class StackMinElement {

    Stack<Integer> s1;
    Stack<Integer> s2;
    public StackMinElement()
    {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }

    public void push(int data)
    {
        int minElement=Math.min(data,getMin());
        if(data==minElement)
        {
            s2.push(data);
        }
        s1.push(data);
    }

    public int pop()
    {
        int value=s1.pop();
        if(value==getMin())
        {
            s2.pop();
        }

        return value;
    }
    public int getMin()
    {
        if(s2.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        return s2.peek();
    }



    public static void main(String args[])
    {
        StackMinElement sm=new StackMinElement();

        sm.push(5);
        sm.push(10);
        System.out.println(sm.getMin());
        sm.pop();
        sm.push(-1);
        sm.push(0);
        sm.pop();
        sm.pop();
        System.out.println(sm.getMin());
    }
}
