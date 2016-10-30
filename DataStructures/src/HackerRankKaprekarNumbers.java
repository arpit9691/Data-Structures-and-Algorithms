import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class HackerRankKaprekarNumbers {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        String output = "";
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i = p; i <= q; i++){
            
            BigInteger temp = BigInteger.valueOf(i);
            BigInteger square = temp.multiply(temp);
            String noOfDigits=Integer.toString(i);
            String str=square.toString();
            System.out.println(noOfDigits+" "+str);
            System.out.println(str.length()+" "+noOfDigits.length());
            String Rhalf=str.substring((str.length()-noOfDigits.length()),str.length());
            String Lhalf=str.substring(0,(str.length()-noOfDigits.length()));
            System.out.println(Rhalf+" "+Lhalf);
            int number=0;
            if(str.length()>1)
            {
                
                 number=Integer.parseInt(Lhalf)+Integer.parseInt(Rhalf);   
               
            }
            else
            {
                number=Integer.parseInt(Rhalf);    
            }
            
            
            if(number==i)
            {
                list.add(number);    
            }
            
            
            
        }
        
        if(list.size()==0)
        {
            System.out.println("INVALID RANGE");    
        }
            
            for(int i:list)
            {
                System.out.print(i+" ");
            }
        }
}
