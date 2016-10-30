
public class CheckPalindrom {
	
	public static boolean testPalindrom(String test)
	{
		
		if(test.length()<=0)
		{
			return false;
		}
		
		if(test.length()==1)
		{
			if(test==" ".intern())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
		char[] str=test.toLowerCase().toCharArray();
		//System.out.println(str.length);
		for(int i=0,j=str.length-1;i<str.length/2;i++,j--)
		{
			
			if(str[i]!=str[j])
			{
				return false;
			}
		}
		return true;
	}
	
	public static int calculateOperations(String str)
	{
		int count=0;
		char[] a={};
		if(testPalindrom(str))
		{
			return count;
		}
		else
		{
			a=str.toLowerCase().toCharArray();
			for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
			{
				if(a[i]!=a[j] && a[i]>a[j])
				{
					count =count+(a[i]-a[j]);
				}
				else if(a[i]!=a[j] && a[i]<a[j])
				{
					count =count+(a[j]-a[i]);
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=calculateOperations("abc");
		System.out.println(r);

	}

}
