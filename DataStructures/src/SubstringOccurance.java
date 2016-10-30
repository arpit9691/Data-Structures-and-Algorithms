
public class SubstringOccurance {
	
/*	public static int subStringCount(String s,String sub)
	{
		int l = s.length(); int count=0;
		int lsub = sub.length();
		for(int i=0;i<l;i++)
		{
			for(int j=i;j<i+lsub;j++)
			{
				if(j<=l)
				{
				if(s.charAt(i)==sub.charAt(j))
				{
					i=i+lsub-1;
					count++;
				}
				}
			}
		}
		return count;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaaaabdeab";
		int index=0;int count=0;
		String sub="aa";
		
		/*while((index=s.indexOf("aa",index))!=-1)
		{
			System.out.println(index);
			index+="aa".length();
			count++;
		}*/
		int i=0;
		//System.out.println(s.substring(i,i+2));
		while(s.substring(i, i+sub.length()).equals("aa"))
		{
			i+=sub.length();
			//System.out.println(i);
			count++;
			//System.out.println(count);
		}
		
		System.out.println(count);

	}

}
