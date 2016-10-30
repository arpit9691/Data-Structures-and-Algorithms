import java.util.Stack;

/**
 * Created by Arpit on 10/28/2016.
 */
public class StackMinimumElement {
    Stack<StackNodeWithMinimum> s;

    public StackMinimumElement()
    {
        s=new Stack<StackNodeWithMinimum>();
    }

    public void push(int data)
    {
        int newMin=Math.min(data,getMin());

        s.push(new StackNodeWithMinimum(data,newMin));
    }

    public int pop()
    {

        int value=s.pop().data;
        return value;
    }

    public int getMin()
    {
        if(s.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        StackNodeWithMinimum st=s.peek();
        return st.min;
    }

    public static void main(String args[])
    {
        StackMinimumElement stack=new StackMinimumElement();

        stack.push(1);
        stack.push(2);stack.push(0);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());


    }
}
