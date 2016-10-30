/**
 * Created by Arpit on 9/13/2016.
 */
public class DoublyLinkedList {

    DoublyLinkedListNode head=null;
    public DoublyLinkedList()
    {

    }

    public void addNode(int data)
    {
        DoublyLinkedListNode newNode=new DoublyLinkedListNode(data);
        DoublyLinkedListNode temp=head;
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.right=newNode;
            newNode.left=temp;
        }
    }

    public void addAfterNode(int data,int newData)
    {
        DoublyLinkedListNode newNode=new DoublyLinkedListNode(newData);
        DoublyLinkedListNode prev=head;

        while(prev.data!=data)
        {
            prev=prev.right;

        }

        if(prev.right==null)
        {
            prev.right=newNode;
            newNode.left=prev;

        }
        else
        {
            newNode.right=prev.right;
            prev.right=newNode;
            newNode.left=prev;
            newNode.right.left=newNode;
        }


    }

    public void addBeforeNode(int data,int newData)
    {
        DoublyLinkedListNode newNode=new DoublyLinkedListNode(newData);
        DoublyLinkedListNode temp=head;

        if(head.data==data)
        {
            newNode.right=head;
            head.left=newNode;
            head=newNode;
        }

        else
        {
            while(temp.data!=data)
            {
                temp=temp.right;
            }
            temp.left.right=newNode;
            newNode.left=temp.left;
            newNode.right=temp;
            temp.left=newNode;
        }


    }

    public void deleteNode()
    {
        DoublyLinkedListNode temp=head;

        if(head.right==null)
        {
            head=null;
        }
        else
        {
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.left.right=null;
        }
    }

    public void deleteAfterNode(int data)
    {
        DoublyLinkedListNode temp=head;
        while(temp.data!=data)
        {
            temp=temp.right;
        }
        if(temp.right==null)
        {
            System.out.println("This Last Node of List! Not able to delete");
        }
        else if(temp.right.right==null)
        {
            temp.right=null;
        }
        else
        {
            temp.right=temp.right.right;
            temp.right.left=temp;

        }
    }

    public void deleteBeforeNode(int data)
    {
        DoublyLinkedListNode temp=head;

        if(data==head.right.data)
        {
            head=head.right;
            head.left=null;
        }
        else{

            while(temp.data!=data)
            {
                temp=temp.right;
            }
            temp.left=temp.left.left;
            temp.left.right=temp;
        }
    }


    public void print()
    {
        if(head==null)
        {
            System.out.println("Empty Doubly Linkedlist");
        }
        else
        {
            DoublyLinkedListNode temp=head;
            while(temp.right!=null)
            {
                System.out.print(temp.data + "->");
                temp=temp.right;
            }
            System.out.println(temp.data);

            while(temp.left!=null)
            {
                System.out.print(temp.data + "<-");
                temp=temp.left;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String args[])
    {
        DoublyLinkedList dl=new DoublyLinkedList();

        dl.addNode(1);
        //dl.deleteNode();
       /* dl.print();
        dl.addNode(2);
        dl.addNode(3);
        dl.addNode(4);
        dl.addNode(5);*/
        dl.print();
        dl.addAfterNode(1,5);
        dl.print();
        dl.addAfterNode(1,2);
        dl.print();
        dl.addBeforeNode(5,4);
        dl.print();
        dl.addBeforeNode(1,0);
        dl.print();
        dl.addBeforeNode(4,3);
        dl.print();
        dl.deleteNode();
        dl.print();
        dl.deleteAfterNode(3);
        dl.print();
        dl.deleteBeforeNode(3);
        dl.print();
    }
}
