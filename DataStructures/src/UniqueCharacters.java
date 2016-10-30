
public class UniqueCharacters {
	
	public static boolean checkUnique(String s)
	{
		//char[] a = s.toCharArray();
		boolean[] b = new boolean[256];
		if(s==null)
		{
			return false;
		}
		for(int i=0;i<s.length();i++)
		{
			int n=s.charAt(i);
			if(b[n])
			{
				return false;
			}
			else
			{
				b[n]=true;
			}
		}
		return true;
	}
	
	public static void reverseString(String s)
	{
		char[] b = s.toCharArray();
		
		for(int i=0,j=b.length-1;i<b.length/2;i++,j--)
		{
			char temp = b[i];
			b[i]=b[j];
			b[j]=temp;
		}
		
		String res=b.toString();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
		
		//System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abaacde";
		boolean res=checkUnique(s);
		
		if(res)
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("not unique");
		}
		
		reverseString(s);

	}

}
