import java.util.HashMap;

public class CreateLinkedList {

	LinkedListNode head = null;

	public CreateLinkedList() {

	}
	
	public void setHead(LinkedListNode node)
	{
		this.head=node;
	}
	
	public LinkedListNode getHead()
	{
		return this.head;
	}

	public void addNode(int data) {
		LinkedListNode newNode = new LinkedListNode(data);
		LinkedListNode temp = head;
		if (head == null) {
			head = newNode;

		} else {

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void addBeforeNode(int data, int newData) {
		LinkedListNode previous = head;
		LinkedListNode current = head;
		LinkedListNode newNode = new LinkedListNode(newData);

		if (head.data == data) {
			newNode.next = head;
			head = newNode;
		} else {
			while (current.data != data && current.next != null) {
				previous = current;
				current = current.next;
			}

			if (current.data == data) {

				previous.next = newNode;
				newNode.next = current;
			}

			else if (current.data != data && current.next == null) {
				System.out.println("Node Not found!! Not able to insert!");
			}
		}
	}

	public void addAfterNode(int data, int newData) {
		LinkedListNode temp = head;
		LinkedListNode curr;
		LinkedListNode newNode = new LinkedListNode(newData);

		while (temp.data != data && temp.next != null) {
			temp = temp.next;

		}

		if (temp.data == data && temp.next != null) {
			curr = temp.next;
			temp.next = newNode;
			newNode.next = curr;
		}

		else if (temp.data == data && temp.next == null) {
			temp.next = newNode;
		}

		else {
			System.out.println("Node not found!! Not able to insert!");
		}

	}

	public void deleteNode(int data) {
		LinkedListNode temp, previous;
		if (head.data == data) {
			head = head.next;
		} else {
			temp = head;
			previous = head;
			while (temp.data != data && temp.next != null) {
				previous = temp;
				temp = temp.next;
			}
			if (temp.data != data) {
				System.out.println("Node not found");
			} else {
				previous.next = temp.next;
			}

		}
	}

	public void deleteBeforeNode(int data) {
		LinkedListNode first = head;
		LinkedListNode second = head;
		LinkedListNode current = head.next;

		while (current.data != data && current.next != null) {
			first = second;
			second = current;
			current = current.next;
		}

		if (current.data == data && second == head) {
			head = current;
		} else if (current.data == data) {

			first.next = second.next;
		} else {
			System.out.println("Node not found!! not able to delete!");
		}
	}

	public void deleteAfterNode(int data) {
		LinkedListNode current = head;
		LinkedListNode fastForward = head.next;

		while (current.data != data && fastForward.next != null) {
			current = fastForward;
			fastForward = fastForward.next;
		}

		if (current.data == data) {
			if (fastForward.next == null) {
				current.next = null;
			} else
				current.next = fastForward.next;
		} else {
			System.out.println("Not able to find node!! Not able to delete!");
		}
	}

	public void reverseLinkedList() {
		LinkedListNode previous = null;
		LinkedListNode current = head;
		LinkedListNode temp = head;

		while (temp != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}

		head = previous;
	}

	public int cycleDetect() {
		LinkedListNode slow = head;
		LinkedListNode fast = head;

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		if (fast.next == null) {
			return 0;
		}

		slow = head;

		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return fast.data;

	}

	public void removeDuplicates() {
		LinkedListNode previous = head;
		LinkedListNode current = head;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		while (current != null) {
			if (hm.containsKey(current.data)) {
				previous.next = current.next;
			} 
			else 
			{
				hm.put(current.data, 1);
				
					previous = current;
			}
			
			current = current.next;
		}

	}

	public void removeDuplicate() {
		LinkedListNode current = head;
		LinkedListNode temp = head;
		LinkedListNode prevOfTemp = head;

		while (current != null) {

			temp = current.next;

			while (temp != null) {
				if (current.data == temp.data) {
					prevOfTemp.next = temp.next;
				} else {
					prevOfTemp = temp;
				}

				temp = temp.next;
			}
			
			current = current.next;
			prevOfTemp = current;
		}
	}
	
	public static CreateLinkedList sumOfList(CreateLinkedList L1,CreateLinkedList L2)
	{
		
		CreateLinkedList L=new CreateLinkedList();
		LinkedListNode temp1=L1.getHead();
		LinkedListNode temp2=L2.getHead();
		String str1="";
		String str2="";
		while(temp1!=null)
		{
			
			str1=str1+temp1.data;
			temp1=temp1.next;
		}
		while(temp2!=null)
		{
			str2=str2+temp2.data;
			temp2=temp2.next;
		}
		
		
		int a=Integer.parseInt(str1);
		int b =Integer.parseInt(str2);
		int c=a+b;
		System.out.println(c);
		int i=0;
		int[] r=new int[3];
		int j=0;
		while(c!=0)
		{
			i=c%10;
			c=c/10;
			r[j]=i;
			j++;
		}
		
		for(int k=j-1;k>=0;k--)
		{
			L.addNode(r[k]);
		}
		
		return L;
	}
	
	public LinkedListNode nthNodeFromLast(int n)
	{
		LinkedListNode slow=head;
		LinkedListNode fast=head;
		
		//System.out.println(slow.data+" "+fast.data);
			if(slow.next==null && n==1)
			{
				return slow;
			}
		
		for(int i=0;i<n-1;i++)
		{
			if(fast.next==null)
			{
				System.out.println("n is large than that length of the list");
			}
			fast=fast.next;
		}
		//System.out.println(fast.data+" "+slow.data);
		while(fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
		
	}

	public LinkedListNode getMidElement()
	{
		LinkedListNode slow=head;
		LinkedListNode fast=head;

		while(fast.next!=null)
		{
			if(fast.next.next==null)
			{
				//return slow.data;
				return slow;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		//return slow.data;
		return slow;
	}

	public void deleteMiddleElement(LinkedListNode node)
	{

		if(node.next!=null)
		{

			node.data=node.next.data;
			node.next=node.next.next;
		}
		else
		{

			this.head=null;
		}
	}

	public void deleteEveryKElement(int n)
	{
		LinkedListNode temp=head;
		LinkedListNode temp1=head;
		int count=0;

		if(n==1)
		{
			this.head=null;
		}

		for(int i=0;i<n-1;i++)
		{
			temp=temp1;
			temp1=temp1.next;
		}
		temp1=temp1.next;
		temp.next=temp1;

		while(temp1!=null && count<=n)
		{
			if(count==n-1)
			{
				temp1=temp1.next;
				temp.next=temp1;
				count=0;
			}
			else

			{
				temp=temp1;
				temp1=temp1.next;

				count++;
			}



		}


	}

	public void rotateListKTimmes(int n)
	{
		LinkedListNode temp=head;
		LinkedListNode prevHead=new LinkedListNode(head.data);
        LinkedListNode curr=prevHead;

		for(int i=0;i<n-1;i++)
		{
			temp=temp.next;
            curr.next=temp;
            curr=curr.next;
		}
        if(temp.next!=null)
        {
            this.setHead(temp.next);
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            curr.next=null;
            temp.next=prevHead;
        }

	}

    public void rotateKTimes(int n)
    {
        LinkedListNode temp=head;

        String temp1[] = {"a","b","c"};

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        for(int i=0;i<n-1;i++)
        {

        }
    }

    public void deleteElementGreaterThanK(int data)
    {
        LinkedListNode temp=head;
        LinkedListNode prev=null;

        while(temp!=null)
        {

            if(temp.data>data && temp==head)
            {
                temp=temp.next;
                head=temp;
            }
            else if(temp.data>data){
                temp=temp.next;
                prev.next=temp;
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
    }

	public void  partitionList(LinkedListNode node,int data)
	{
		LinkedListNode list=null;
		LinkedListNode temp=node.next;

		while(temp!=null)
		{
			LinkedListNode newNode=temp.next;

			if(temp.data<data)
			{
				temp.next=this.head;
				this.head=temp;
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

	public void deleteFromK(int position,int count,LinkedListNode node)
	{
		LinkedListNode Current=node;
		LinkedListNode temp=node.next;



		if(position==1)
		{
			while(count!=0 && Current!=null)
			{
				Current=Current.next;
				node=Current;
				count--;
			}

			this.head=node;
		}


		for(int i=0;i<position-1;i++)
		{
			if(Current.next==null)
			{
				break;
			}
			Current=Current.next;
			temp=temp.next;
		}


		while(count!=0 && temp!=null)
		{
			Current.next=temp.next;
			temp=temp.next;
			count--;
		}

	}

	public void print() {
		LinkedListNode temp = this.getHead();

		if (temp == null) {
			System.out.println("Empty Linked List");
		}

		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CreateLinkedList L = new CreateLinkedList();
		L.addNode(1);
		L.addNode(2);
		L.addNode(3);
		L.addNode(4);
		L.addNode(5);
		L.addNode(7);
		L.print();
		L.deleteNode(4);
		L.print();
		L.addAfterNode(3, 4);
		L.addAfterNode(5, 6);
		L.print();
		L.deleteNode(2);
		L.deleteNode(3);
		L.deleteNode(4);
		L.deleteNode(5);
		L.deleteNode(6);
		L.deleteNode(7);
		L.print();
		L.addAfterNode(1, 2);
		L.print();
		L.addNode(3);
		L.addNode(4);
		L.addNode(6);
		L.print();
		L.addBeforeNode(1, 0);
		L.print();
		L.deleteBeforeNode(1);
		L.print();
		L.deleteBeforeNode(3);
		L.print();
		L.deleteBeforeNode(6);
		L.print();
		L.deleteBeforeNode(9);
		L.print();
		L.deleteAfterNode(9);
		L.print();
		L.reverseLinkedList();
		L.print();
		L.deleteAfterNode(3);
		L.deleteAfterNode(6);
		L.reverseLinkedList();
		L.print();
		L.addNode(1);
		L.addNode(2);
		L.addNode(3);
		L.addNode(4);
		L.addNode(5);
		L.addNode(7);
		L.print();
		// L.head.next.next.next.next=L.head.next.next;
		System.out.println("data is" + L.cycleDetect());
		L.addNode(2);
		L.addNode(10);
		L.print();
		L.removeDuplicates();
		L.print();
		L.addAfterNode(6, 6);
		L.print();
		L.removeDuplicates();
		L.print();
		L.addAfterNode(10, 10);
		L.addAfterNode(10, 10);
		L.print();
		L.removeDuplicate();
		L.print();*/
		
		CreateLinkedList L1=new CreateLinkedList();
		CreateLinkedList L2=new CreateLinkedList();
		L1.addNode(1);
		L1.addNode(2);
		L1.addNode(0);
		L1.print();
		L2.addNode(1);
		L2.addNode(4);
		L2.addNode(2);
		L2.print();
		CreateLinkedList L3=sumOfList(L1, L2);
		System.out.println(L3.getHead().data);
		L3.print();
		
		
		LinkedListNode last=L1.nthNodeFromLast(1);
		//System.out.println(last.data);

		System.out.println("This"+L3.getMidElement());
		L3.addNode(5);
		System.out.println("This"+L3.getMidElement());
		L3.addNode(7);
		System.out.println("This"+L3.getMidElement());
		/*L3.deleteNode(7);
		L3.deleteNode(5);
		L3.deleteNode(2);*/
		L3.print();
		L3.deleteMiddleElement(L3.getMidElement());
		L3.print();
		L3.deleteNode(7);
		L3.deleteNode(5);
		L3.deleteNode(2);
		System.out.println("Before");
		L3.print();
		L3.deleteMiddleElement(L3.getMidElement());
		System.out.println("Latest");
		L3.print();
		/*System.out.println("This"+L3.getMidElement());
		L3.deleteNode(2);
		System.out.println("This"+L3.getMidElement());*/

		L3.addNode(1);
		L3.addNode(2);
		L3.addNode(3);
		L3.addNode(4);
		L3.addNode(5);
		L3.print();
		L3.deleteEveryKElement(5);
		L3.print();
		L3.rotateListKTimmes(4);
        //System.out.println(L3.getHead());
        L3.print();
        L3.deleteElementGreaterThanK(4);
		System.out.println();
		L3.print();
		/*L3.deleteFromK(1,4,L3.getHead());
		System.out.println();
		L3.print();*/

		
		
		

	}

}
