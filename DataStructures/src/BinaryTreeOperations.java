import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


public class BinaryTreeOperations {

	private static BinaryTreeNode root;
	private static BinaryTreeNode bstRoot;
	
	public int depthOfTree(BinaryTreeNode node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			int leftDepth = depthOfTree(node.left);
			int rightDepth = depthOfTree(node.right);
			
			if(leftDepth>rightDepth)
			{
				return leftDepth+1;
			}
			else
			{
				return rightDepth+1;
			}
		}
		
	}
	
	public int countOfNodes(BinaryTreeNode node)
	{
		int count =0;
		if(node==null)
		{			
			return count;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		q.offer(node);
		while(!q.isEmpty())
		{
			BinaryTreeNode temp = q.poll();
			count++;
			if(temp.left!=null)
			{
				q.offer(temp.left);
			}
			if(temp.right!=null)
			{
				q.offer(temp.right);
			}
			
		}
		return count;
		
	}
	
	public int preOrderTraversal(BinaryTreeNode node)
	{
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		int max=0;
		if(node == null)
		{
			System.out.println("invalid binary tree");
		}
		
		s.push(node);
		while(!s.isEmpty())
		{
			BinaryTreeNode temp = s.pop();
			System.out.println(temp.data);
			if(temp.right!=null)
			{
				s.push(temp.right);
			}
			if(temp.left!=null)
			{
				s.push(temp.left);
			}
			
			if(s.size()>max)
			{
				max=s.size();
			}
			
		}
		return max;
		
		
	}
	public void inOrderTraversal(BinaryTreeNode node)
	{
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode Current = node;
		if(node == null)
		{
			System.out.println("Not valid Tree");
		}
		boolean isDone = false;
		
		while(!isDone)
		{
			if(Current!= null)
			{
				s.push(Current);
				Current = Current.left;
			}
			else
			{
				if(s.isEmpty())
				{
					isDone = true;
				}
				else
				{
					Current = s.pop();
					System.out.print(Current.data + " ");
					Current = Current.right;
				}
			}
		}
	}
	
	public int maxElement(BinaryTreeNode node,int max)
	{
		//int sum =0;
		//int max=Integer.MIN_VALUE;
		if(node==null)
		{
			return 0;
		}
		
		if(node.data>max)
		{
			max=node.data;
		}
		
		int leftMax = maxElement(node.left,max);
		int rightMax =maxElement(node.right,max);
		
		if(leftMax>rightMax)
		{
			max=leftMax;
		}
		if(leftMax<rightMax)
		{
			max=rightMax;
		}
		/*if(node.data>max)
		{
			max=node.data;
		}*/
		
		return max;
	}
	
	public int sum(BinaryTreeNode node)
	{
		int sum=0;
		if(node==null)
		{
			return 0;
		}
		
		int leftSum=sum(node.left);
		int rightSum=sum(node.right);
		sum=sum+ leftSum+rightSum+node.data;
		return sum;
		
	}
	
	public void printLevelOrderReverse(BinaryTreeNode node)
	{
		if(node==null)
		{
			System.out.println("Tree not Valid");
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(node);
		while(!q.isEmpty())
		{
			BinaryTreeNode temp=q.poll();
			if(temp.right!=null)
			{
				q.offer(temp.right);
			}
			if(temp.left!=null)
			{
				q.offer(temp.left);
			}
			s.push(temp);
		}
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop().data);
		}
	}
	
	public int heightOfTree(BinaryTreeNode node)
	{
		if(node==null)
		{
		return 0;
		}
		int leftHeight = heightOfTree(node.left);
		int rightHeight = heightOfTree(node.right);
		
		return Math.max(leftHeight, rightHeight)+1;
		
	}
	
	public int depthOfTreeWithLevelOrder(BinaryTreeNode node)
	{
		int count=0; int leafCount=0;
		int levelNodes =0;
		BinaryTreeNode temp=null;
		if(node==null)
		{
		return count;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(node);
		while(!q.isEmpty())
		{
				levelNodes = q.size();
				while(levelNodes>0)
				{
					 temp=q.remove();
					/*if(count%2!=0)
					{*/
					System.out.print(temp.data+" ");
					/*}*/
					if(temp.left!=null)
					{
						q.offer(temp.left);
					}
					if(temp.right!=null)
					{
						q.offer(temp.right);
					}
					if(temp.left==null && temp.right==null)
					{
						leafCount++;
					}
					levelNodes--;
			}
			count++;
			System.out.println();
		}
		System.out.println(temp.data);
		System.out.println(leafCount);
		return count;
	}
	
	public boolean searchBST(BinaryTreeNode node,int data)
	{
		if(node == null)
		{
			return false;
		}
	while(node!=null)
	{
		if(node.data==data){
			return true;
		}
		
		else if(data<node.data)
		{
			node = node.left;
		}
		
		else
		{
			node = node.right;
		}
	}
		
		return false;
	}
	
	public BinaryTreeNode insertNodeBST(BinaryTreeNode node, int data)
	{
		BinaryTreeNode temp = new BinaryTreeNode(data);
		 
		if(node == null)
		{
			
			return temp;
		}
		
		if(node!=null)
		{
			if(data<node.data)
			{
				node.left=insertNodeBST(node.left,data);
			}
			else
			{
				node.right=insertNodeBST(node.right,data);
			}
		}
		
		System.out.println("Done");
		
		return node;
	}

	public BinaryTreeNode inorderSuccessor(BinaryTreeNode root,int data)
	{
		BinaryTreeNode temp=null;
		BinaryTreeNode cur=root;
		while(true)
		{


		if(cur.data==data || cur==null)
		{
			temp=cur;
			break;
		}
		else if(cur.left!=null && data<cur.data)
		{
			cur=cur.left;
		}
		else if(cur.right!=null && data>cur.data)
		{
			cur=cur.right;
		}
		}

		if(temp.right!=null)
		{
			temp=temp.right;
			while(temp.left!=null)
			{
				temp=temp.left;
			}
			return temp;
		}
		else
		{
			BinaryTreeNode Successor=null;
			BinaryTreeNode ancestor=root;

			while(ancestor!=temp)
			{
				if(temp.data<ancestor.data)
				{
					Successor=ancestor;
					ancestor=ancestor.left;
				}
				else
				{
					ancestor=ancestor.right;
				}
			}
			return Successor;
		}



	}

	public static int pathSumFromRootToLeaf(BinaryTreeNode root,int sum)
	{

		int count=countPaths(root,sum-root.data);


		return count;
	}

	public static int countPaths(BinaryTreeNode root,int targetSum)
	{
		int count=0;
		if(root.left==null && root.right==null && targetSum==0)
		{
			count++;
		}

		if(root.left!=null)
		{
			count=count+countPaths(root.left,targetSum-root.left.data);
		}

		if(root.right!=null)
		{
			count=count + countPaths(root.right, targetSum - root.right.data);
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeOperations tree = new BinaryTreeOperations();
		BinaryTreeOperations bstTree = new BinaryTreeOperations();
		 
        tree.root = new BinaryTreeNode(1);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(5);
        tree.root.right.left = new BinaryTreeNode(6);
        tree.root.right.right=new BinaryTreeNode(7);
        
        bstTree.bstRoot = new BinaryTreeNode(10);
        bstTree.bstRoot.left=new BinaryTreeNode(7);
        bstTree.bstRoot.right=new BinaryTreeNode(20);
        bstTree.bstRoot.left.left = new BinaryTreeNode(5);
        bstTree.bstRoot.left.right = new BinaryTreeNode(9);
        bstTree.bstRoot.left.left.left=new BinaryTreeNode(3);
        bstTree.bstRoot.right.left = new BinaryTreeNode(15);
        bstTree.bstRoot.right.right = new BinaryTreeNode(22);
        bstTree.bstRoot.right.left.right = new BinaryTreeNode(17);
		bstTree.inOrderTraversal(bstRoot);
		System.out.println("HI::::"+bstTree.inorderSuccessor(bstRoot,3).data);
		System.out.println(pathSumFromRootToLeaf(bstRoot, 26));
 
        //System.out.println("Height of tree is : " + tree.depthOfTree(root));
        //System.out.println(tree.countOfNodes(root));
        //System.out.println("HI:"+tree.preOrderTraversal(root));
        //tree.inOrderTraversal(root);
        //System.out.println(tree.maxElement(root,Integer.MIN_VALUE));
        //System.out.println(tree.sum(root));
        //tree.printLevelOrderReverse(root);
        //System.out.println(tree.heightOfTree(root));
        System.out.println(tree.depthOfTreeWithLevelOrder(root));
        System.out.println(bstTree.searchBST(bstRoot, 0));
        BinaryTreeNode n =bstTree.insertNodeBST(null, 55);
        System.out.println(n.data);
		//bstTree.inOrderTraversal(n);
	}

}
