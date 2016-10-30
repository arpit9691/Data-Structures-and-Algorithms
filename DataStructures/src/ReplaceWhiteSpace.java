
public class ReplaceWhiteSpace {
	
	public static void replaceSpace(String s,int length)
	{
		String newString = s.trim();
		char[] charArray = newString.toCharArray();
		String[] S = new String[charArray.length];
		
	String[] S1= newString.split(" ");
	int l = S1.length;
	for(int i =0;i<=l;i++){
		System.out.println(S1[i]);
	}
	System.out.println(l);
		//String ns =newString.replace(" ", "%20");
		//return ns;
		for (int i =0;i<=charArray.length;i++)
		{
			S[i] = String.valueOf(charArray[i]);
			if (S[i] == " ")
			{
				
			}
		}
	
	}
		
		/*for (int i =0;i<=charArray.length;i++)
		{
			S[i] = String.valueOf(charArray[i]);
			if (S[i] == " ")
			{
				
			}
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Arpit     Patel Ashokbhai";
		replaceSpace(s,s.length());
		//System.out.println("hi: "+s1);

	}

}
