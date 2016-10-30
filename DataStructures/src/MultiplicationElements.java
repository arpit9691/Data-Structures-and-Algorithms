
public class MultiplicationElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = new String[4];
		s[0]="A";
		s[1]="B";
		s[2]="C";
		s[3]="D";
		int l =s.length;
		String[] a = new String[l];
		
		String s1 = s[0]+s[1]+s[2]+s[3];
		
		for(int i=0;i<l;i++)
		{
			int j=0;String str="";
			while(j<l)
			{	if(i == j)
			{
				j++;
			}
			else
			{
				str = str+s[j];
				j++;
			}
			}
			a[i]=str;
			System.out.println(a[i]);
			
		}
	}

}
