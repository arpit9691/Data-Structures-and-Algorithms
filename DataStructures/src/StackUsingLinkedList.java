/**
 * Created by Arpit on 9/10/2016.
 */
public class StackUsingLinkedList {

    LinkedListNode head;
    int length=0;
    LinkedListNode mid;
    public StackUsingLinkedList()
    {
    }
    public void push(int x)
    {
        LinkedListNode newTop=new LinkedListNode(x);
        if(head==null)
        {
            head=newTop;
            mid=head;
        }
        else
        {
            newTop.next=head;
            head=newTop;
        }

        length++;
        if(length%2!=0)
        {
            mid=newTop.next;
        }
        else
        {

        }
    }

    public int pop()
    {
        LinkedListNode temp=head;
        if(head!=null)
        {
            head=head.next;
        }
        length--;
        if(length%2!=0)
        {
            mid=mid.next;
        }
        else
        {

        }
        return temp.data;
    }

    public int midElement()
    {

        return mid.data;
    }

    public static void main(String args[])
    {

    }
}
