
public class StackImplementations {
	static int top=-1;
	public static void push(int n,int[] a)
	{
		//int top=0;
		if(top == a.length-1)
		{
			System.out.println("stack is full");
			
		}
		
		else
		{
			top++;
			a[top]=n;
			
		}
	}
	
	public static int pop(int[] a)
	{
		int n=0;
		if(top == -1)
		{
			System.out.println("stack is empty");
			
			
		}
		
		else
		{
			n= a[top];
			a[top]=Integer.MIN_VALUE;
			top--;
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
		int[] a = new int[10];
		push(5,a);
		push(6,a);
		push(-1,a);	
		push(4,a);
		push(10,a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("after push:"+a[i]);
		}
		int r=pop(a);
		System.out.println("1st pop"+r);
		r=pop(a);
		System.out.println("2nd pop"+r);
		r=pop(a);
		System.out.println("3rd pop"+r);
		r=pop(a);
		System.out.println("4th pop"+r);
		r=pop(a);
		System.out.println("5th pop"+r);
		r=pop(a);
		System.out.println("6th pop"+r);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>Integer.MIN_VALUE)
			System.out.println("after pop:"+a[i]);
		}

	}

}
