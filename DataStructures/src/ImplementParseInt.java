/**
 * Created by Arpit on 9/30/2016.
 */
public class ImplementParseInt {

    public static void main(String args[])
    {
        String s="1234";
        int sum=0;
        int length=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int temp=c-'0';
            sum= (int) (sum+temp*(Math.pow(10,length)));
            System.out.println(sum);
            length--;
        }
        System.out.println(sum);
    }
}
