
public class FizzBuzzAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="";
		for(int i=1;i<=100;i++)
		{
			
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("Gizz");
			}
			
			 if(i % 3 == 0)
			{
				System.out.println("Fizz");
				 //test = test+"Fizz"+" ";
			}
			
			 else if (i % 5 == 0)
			{
				System.out.println("Buzz");
				//test = test+"Buzz"+" ";
			}
			
			 else
			{
				System.out.println(i);
				//test = test+String.valueOf(i)+" ";
			}
		}
		
		//System.out.println(test);

	}

}
