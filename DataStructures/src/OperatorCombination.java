import java.util.*;
import java.io.*;


public class OperatorCombination {

	/**
	 * @param args
	 */
	static long startTime;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  startTime = System.currentTimeMillis();
			
		  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  	String inputNums;
		  	while((inputNums = br.readLine()) != null)
		  	{
		  		inputNums = inputNums.trim();
		  		System.out.println(inputNums);
		  		System.out.println("hello");
				String input[] = inputNums.split(" ");
			 	System.out.println("hello");
				int inputLength = input.length;
				int inputNumbers[] = new int[inputLength];
				int index=0;
				while(index<inputLength)
				{
					inputNumbers[index]=Integer.parseInt(input[index]);
					index++;
					
				}
				
				ArrayList<Character> a1 = new ArrayList<Character>();
				a1.add('+');
				a1.add('*');
				a1.add('-');

				int[] operands = new int[]{2,3,7,8,9};
				
				System.out.println(inputNumbers);

				int totalCombinations = (int) Math.pow(a1.size(), inputNumbers.length);
				StringBuffer s = new StringBuffer();
				int j=1;
				for(int i=0;i<totalCombinations;i++)
				{
					j=1;
					for(int k=1;k<=4;k++)
					{
						s.append(a1.get((i/j)%3));
						j=j*3;
						
					}
				
					String operatorCombination = s.toString();
					s.delete(0, s.length());
					boolean isNumber = checkNumber(operatorCombination,inputNumbers);
					if(isNumber)
					{
						 long stopTime = System.currentTimeMillis();
						 long elapsedtime = stopTime - startTime;
						 System.out.println(elapsedtime);
						System.out.println(isNumber);
						break;
					}
					

					}
				
					}
				
		}
		  	
		  
	
	public static boolean checkNumber(String str, int[] operands)
	{
		
		int index = 0;
		int length = str.length();
		int operand1 = operands[0];
		int operand2 = operands[1];
		int nextOperand = 2;
	
		while(index < length)
		{

			char c = str.charAt(index);
			
			switch(c)
			{
			case '+':
				operand1 = operand1+operand2;
				if(nextOperand<operands.length)
				{
					operand2= operands[nextOperand];
				}

				nextOperand++;
				break;
			case '*':
				operand1 = operand1*operand2;
				if(nextOperand<operands.length)
				{
					operand2= operands[nextOperand];
				}

				nextOperand++;
				break;
			case '-':
				operand1 = operand1-operand2;
				if(nextOperand<operands.length)
				{
					operand2= operands[nextOperand];
				}

				nextOperand++;
				break;
			
			
			}
			index++;
		}
		if(operand1 == 42)
		{
			System.out.println("got answer");
			
			return true;
		}
		long stopTime = System.currentTimeMillis();
		 long elapsedtime = stopTime - startTime;
		 return false;
		
		
		
	}
	
	}
