import java.util.HashMap;

import org.omg.CORBA.Current;


public class LinkedList {

	Node head;
	
	public void setHead(Node head)
	{
		this.head = head;
	}
	
	public Node getHead()
	{
		return this.head;
	}
	public void addNode(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			head = node;
		}
		else
		{
		
		Node temp = head;
		while(temp.next!= null){
			temp = temp.next;
			}
		temp.next = node;
		}
		
	}
	
	public void addAfter(int data,int data1)
	{
		Node temp = head;
		while(temp.getData()!=data)
		{
			
			temp = temp.next;
		}
		Node newNode = new Node(data1);
		newNode.next = temp.next;
		temp.next = newNode;
				
	}
	
	public void addBeforeNode(int data, int data1)
	{
		Node current = head;
		Node previous = head;
		while(current.getData()!= data)
		{
			previous = current;
			current = current.next;
		}
		Node newNode = new Node(data1);
		if(previous == head)
		{
			newNode = head;
		}
		else
		{
		previous.next = newNode;
		newNode.next = current;
		}
		
	}
	
	public void deleteNode(int data)
	{
		Node temp = head;
		Node temp1 = head;
		while(temp.getData() != data)
		{
			temp1 = temp;
			temp = temp.next;
		}
		temp1.next = temp.next;
	}
	
	public void deleteBeforeNode(int data)
	{
		Node current = head, previous = head,before = head;
		
		/*while(current.getData()!=data)
		{
			before = previous;
			previous = current;
			current = current.next;
		}
		before = current;*/
		if(current.next.getData() == data)
		{
			head = current.next;
		}
		while (current.next.next != null)
		{
			if(current.next.next.getData()==data)
			{
				current.next = current.next.next;
			}
			current = current.next;
		}
		
	}
	
	public void deleteAfterNode(int data)
	{
		Node temp = head;
		if(temp.next.next != null)
		{
			while (temp.next.getData()!=data)
			{
				temp = temp.next;
			}
			temp=temp.next;
			temp.next = temp.next.next;
		}
		else
		{
			temp.next = null;
		}
	}
	
	public Node nodeFromLast(int index)
	{
		Node previous = head;
		Node current = head;
		if(head == null)
		{
			return null;
		}
		
		
		for(int i=0;i<index-1;i++)
		{
			if(current.next == null)
			{
				return null;
			}
			current = current.next;
		}
		
		while(current.next!= null)
		{
			previous = previous.next;
			current = current.next;
		}
		
		
		return previous;
	}
	
	public Node removeDuplicates(Node node)
	{
		Node temp = node;
		Node previous=node;
		Node current = node.next;
		if(node.next == null)
		{
			return node;
		}
		
		else
		{
			while(previous.next!=null)
			{
				
				while(current!=null)
				{
					//System.out.println("Hi");
				
					if(previous.data==current.data)
					{
						//System.out.println(temp.data+" "+current.data);
						temp.next=current.next;
						//temp = temp.next;
						
				
					}
					else
					{
						//previous = previous.next;
						temp = temp.next;
						//temp=current;
						
					}
					current = current.next;
				}
				previous = previous.next;
				temp=previous;
				current=temp.next;
				
			}
		}
			
			
		return node;
	}
		
		
	public Node nFromLast(Node node,int n)
	{
		Node previous=node;
		Node current=node;
		if(node == null)
		{
			return null;
		}
		for(int i=0;i<n-1;i++)
		{
			if(current.next == null)
			{
				return null;
			}
			current = current.next;
		}
		
		while(current.next!=null)
		{
			previous = previous.next;
			current=current.next;
		}
		
		System.out.println(previous.data);
		return previous;
	}
		
	public void reversList(Node node)
	{
		Node prev = null;
		Node curr = node;
		Node temp = node;
		
		
		

		while(temp!=null)
		{
			
			curr=temp.next;
			temp.next=prev;
			prev=temp;
			temp=curr;
			
		}
		
		head = prev;
	}
	
	public void partitionList(Node node,int x)
	{
		Node list = node;
		Node temp = head;
		
		
		while(temp!=null)
		{
			Node newNode = temp.next;
			if(temp.data<x)
			{
				temp.next=head;
				head=temp;
			}
				else
				{
					list.next=temp;
					list=temp;
				}
			temp=newNode;
		}
		list.next=null;
		
		
		
	}
	
	public LinkedList sumList(Node node,Node node1)
	{
		Node temp= node;
		Node temp1 = node1;
		String s = "";String s1 = "";
		LinkedList L1 = new LinkedList();
		
		while(temp!=null)
		{
			s =s+temp.data;
			temp = temp.next;
		}
		while(temp1!=null)
		{
			s1 =s1+temp1.data;
			temp1 = temp1.next;
		}
		System.out.println(s);
		System.out.println(s1);
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(s1);
		System.out.println(a);
		System.out.println(b);
		int sum = a+b;
		System.out.println(sum);
		int n=0;
		
		while(sum!=0)
		{
			
			n=sum%10;
			sum = sum/10;
			System.out.println(sum);
			System.out.println(n);
			L1.addNode(n);
			
			
		}
		return L1;
	}
	
	public Node detectCycle(Node node)
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			System.out.println("In first while:"+slow.data+" "+fast.data);
			
			if(slow == fast)
			{
				System.out.println("before break:"+slow.data+" "+fast.data);
				break;
			}
		}
			
			if(fast.next == null)
			{
				return null;
			}
			
			slow=head;
			
			while(slow!=fast)
			{
				
				slow = slow.next;
				fast= fast.next;
				
			}
			//fast.next = null;
			
			System.out.println(fast.data);
		
		return fast;
	}
	
	public void removeDuplicate(Node node)
	{
		Node curr =node;
		Node temp=node;
		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
		
		while(curr.next!= null)
		{
			temp = curr.next;
			if(hm.containsKey(temp.data))
			{
				curr.next = temp.next;
			}
			else
			{
				hm.put(curr.data, true);
				curr= curr.next;
				
			}
			
		}
	}
	
	public void removeDuplicateImproved(Node node)
	{
		Node temp=node;
		Node prev=node;
		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
		
		while(temp!=null)
		{
			if(hm.containsKey(temp.data))
			{
				prev.next=temp.next;
				//System.out.println(prev.data+"---->"+temp.data);
			}
			else
			{
				hm.put(temp.data, true);
				prev=prev.next;
			}
			temp=temp.next;
			//System.out.println(temp.data);
		}
		
		
	}
	
	public void getList()
	{
		Node temp = head;
		//System.out.println("SumList"+temp.data);
		while (temp.next!= null)
		{
			System.out.println("Hello :"+temp.getData());
			temp=temp.next;
		}
		System.out.println("Hello :"+temp.getData());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L = new LinkedList();
		LinkedList sum1 = new LinkedList();
		LinkedList sum2 = new LinkedList();
		LinkedList reverseList = new LinkedList();
		
		L.addNode(1);
		L.addNode(2);
		L.addNode(3);
		L.addNode(4);
		L.addNode(5);
		L.getList();
		L.deleteNode(2);
		L.getList();
		
		L.addNode(50);
		L.getList();
		L.addAfter(3, 6);
		L.getList();
		L.addBeforeNode(50, 49);
		L.getList();
		L.deleteBeforeNode(49);
		L.deleteBeforeNode(3);
		System.out.println("Delete Before:");
		L.getList();
		L.deleteAfterNode(4);
		System.out.println("Delete After: ");
		L.getList();
		Node n =L.nodeFromLast(1);
		System.out.println(n.data);
		
		LinkedList L1 = new LinkedList();
		L1.addNode(1);
		Node n1 =L1.nodeFromLast(1);
		System.out.println(n1.data);
		L.getList();
		L.addNode(6);
		L.addNode(4);
		L.addNode(6);
		L.getList();
		System.out.println("For removing duplicates");
		L.removeDuplicates(L.getHead());
		L.getList();
		System.out.println(L.nFromLast(L.getHead(), 4));
		//L.getList();
		L.reversList(L.getHead());
		L.getList();
		System.out.println("Partition");
		L.partitionList(L.getHead(), 50 );
		L.getList();
		System.out.println("Sum List");
		sum1.addNode(7);
		sum1.addNode(1);
		sum1.addNode(6);
		sum2.addNode(5);
		sum2.addNode(9);
		sum2.addNode(2);
	
		
		LinkedList L2 = L1.sumList(sum1.getHead(), sum2.getHead());
		
		System.out.println(L2.getHead().data);
		L2.getList();
		
		L.getList();
		L.addNode(52);
		L.addNode(9);
		L.addNode(4);
		L.getList();
		Node head = L.getHead();
		//head.next.next.next.next.next.next = head.next.next;
		//L.getList();
		//Node temp=L.detectCycle(L.getHead());
		//System.out.println(temp.data);
		//L.getList();
		
		L.addNode(50);
		L.addNode(4);
		L.addNode(4);
		System.out.println("after adding duplicates");
		L.getList();
		L.removeDuplicate(L.getHead());
		System.out.println("after removing duplicates");
		L.getList();
		
		System.out.println("Remove Duplicate Improved Version:-");
		L.getList();
		
		L.addNode(4);
		L.getList();
		L.removeDuplicateImproved(L.getHead());
		System.out.println("Remove Duplicate Improved Version");
		L.getList();
		L.addNode(4);
		L.addNode(4);
		System.out.println("print for remove duplicates");
		L.getList();
		L.removeDuplicates(L.getHead());
		System.out.println("Remove Duplicate Old Version");
		L.getList();
		System.out.println("After Reversal");
		L.reversList(L.getHead());
		L.getList();
		reverseList.addNode(1);
		reverseList.addNode(2);
		reverseList.addNode(3);
		reverseList.addNode(4);
		reverseList.addNode(5);
		reverseList.reversList(reverseList.getHead());
		reverseList.getList();

	}

}
