import java.util.Scanner;


public class StringConvertDouble {
	
	public static double stringToConvertDouble(String str)
	{
		double result=0.0;
		double beforeDecimalInt=0.0;
		double afterDecimalInt=0.0;
		
		if(str == "")
		{
			return 0.00;
		}
		
		if(str.indexOf('.')!= -1)
		{
		String[] sArray = str.split("\\.");
		
		
		char[] beforeDecimal = sArray[0].toCharArray();
		char[] afterDecimal = sArray[1].toCharArray();
		
		beforeDecimalInt=convetToInteger(beforeDecimal);
		afterDecimalInt=convetToInteger(afterDecimal)/(Math.pow(10,afterDecimal.length));

	
		if(beforeDecimal[0]=='-')
		{
	     result = (beforeDecimalInt-afterDecimalInt);
		}
		else
		{
			result = (beforeDecimalInt+afterDecimalInt);
		}
		}
		
		else
		{
			char[] c=str.toCharArray();
			beforeDecimalInt=convetToInteger(c);
			result=beforeDecimalInt;	
		}
	   
		return result;
	}
	
	public static int convetToInteger(char[] a)
	{
		
		int i=0; int negative=1;
		int temp=0;
		if(a[0]=='-')
		{
			negative=-1;
			i++;
		}
				
		for(;i<a.length;i++)
		{
			temp = temp*10 + (a[i]-'0'); 
		}
		return temp*negative;
	}
	

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		double finalResult=stringToConvertDouble(str);
		System.out.println(finalResult);

	}

}
