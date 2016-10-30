
public class ReplacewithString {
	
	public static String replaceString(String a)
	{
		//StringBuilder sb = new StringBuilder();
		char[] result = a.toCharArray();
		int spaceCount=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				//sb.append("%20");
				spaceCount++;
			}
		}
		
	int newLength = result.length+spaceCount*2;
	result[newLength]=' ';
	
	for(int i =a.length()-1;i>=0;i++)
	{
		if(result[i] == ' ')
		{
			result[newLength-1] = '0';
			result[newLength-2] = '2';
			result[newLength-3] = '%';
			newLength = newLength-3;
		}
		
		else
		{
			result[newLength-1]=result[i];
			newLength=newLength-1;
		}
	}
		
/*		char[] res = new char[a.length()+2*spaceCount];
		String resultFinal = "";
		
		for(int i=0;i<result.length;i++)
		{
			if(a.charAt(i)==' ')
			{
				res[i] = '%';
				resultFinal = resultFinal+res[i];
				res[i+1] = '2';
				resultFinal = resultFinal+res[i+1];
				res[i+2] = '0';
				resultFinal = resultFinal+res[i+2];
				
			}
			else
			{
				res[i] = result[i];
				resultFinal = resultFinal+res[i];
			}
		}*/
		
		
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Arpit Patel Arpit     ";
		String a =replaceString(s.trim());
		System.out.println(a);

	}

}
