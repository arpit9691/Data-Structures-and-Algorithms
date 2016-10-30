import java.util.ArrayList;
import java.util.Collections;


public class PermutationOfString {
	
	public static ArrayList<String> permutate(String s)
	{
		ArrayList<String> result=new ArrayList<String>();
		int n=s.length();
		if(n==1)
		{
			result.add(s);
		}
		else if(n>1)
		{
			//int lastIndex=n-1;
			int initialIndex=0;
			//String last=s.substring(lastIndex);
			String first=s.substring(initialIndex,initialIndex+1);
			System.out.println(first);
			String rest=s.substring(initialIndex+1,n);
			//result=mergerWithLastCharacter(permutate(rest),last);
			result=mergerWithLastCharacter(permutate(rest),first);
		}
		
		return result;
	}

	public static ArrayList<String> mergerWithLastCharacter(ArrayList<String> res,String last)
	{
		ArrayList<String> result=new ArrayList<String>();
		
		for(String s:res)
		{
			for(int i=0;i<=s.length();i++)
			{
				String str=new StringBuffer(s).insert(i, last).toString();
				result.add(str);
			}
		}
		Collections.sort(result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="pppp";
		ArrayList<String> done=permutate(str);
		
		for(String s:done)
		{
			System.out.println(s);
		}

	}

}
