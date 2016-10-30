/**
 * 
 */

/**
 * @author Arpit
 *
 */
public class Node {

	/**
	 * @param args
	 */
	Node next;
	int data;
	public Node()
	{
		
	}
	public Node(int data)
	{
		this.next = null;
		this.data = data;
	}
	
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	public Node getNext()
	{
		return next;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	

}
