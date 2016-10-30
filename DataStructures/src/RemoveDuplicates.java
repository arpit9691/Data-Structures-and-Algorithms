
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] str = new boolean[256];
		String s = "asdfjasfdasdf";
		String result="";
		char[] test = s.toCharArray();
		//str[test[0]]=true;
		
		/*for(int i=0;i<256;++i)
		{
			str[i]=false;
		}*/
		int tail=0;
		for(int i=0;i<test.length;++i)
		{
			if(!str[test[i]])
			{
				/*test[tail]=test[i];
				++tail;*/
				str[test[i]]=true;
				result=result+test[i];
				
			}
		}
		
		System.out.println(result);
		
		/*test[tail]='\0';
		
		for(int i=0;i<test.length;i++)
		{
			if(test[i]=='\0')
			{
				break;
			}
			else
			{
			System.out.print(test[i]);
			}
		}*/
		
		
	}

}
