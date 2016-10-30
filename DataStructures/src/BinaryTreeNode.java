/**
 * 
 */

/**
 * @author Arpit
 *
 */
public class BinaryTreeNode {

	/**
	 * @param args
	 */
	BinaryTreeNode left;
	BinaryTreeNode right;
	int data;
	public BinaryTreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.left = null;
		this.right = null;
		this.data = data;
	}
	
	public void setLeft(BinaryTreeNode left)
	{
		this.left = left;
	}
	
	public BinaryTreeNode getLeft()
	{
		return this.left;
	}
	
	public void setRight(BinaryTreeNode right)
	{
		this.right = right;
	}
	
	public BinaryTreeNode getRight()
	{
		return this.right;
	}
	
	public int getData()
	{
		return this.data;
	}


}
