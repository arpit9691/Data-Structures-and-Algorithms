/**
 * Created by Arpit on 10/18/2016.
 */
public class ConsecutiveOnesInBinary {

    public static int countOnes(int n)
    {
        int maxCount=Integer.MIN_VALUE;
        int count=0;

        while(n!=0){
            ///n = n & (n<<1);
            n=n&(n-1);
            count++;
        }
//        for(int i=0;i<31;i++)
//        {
//            if(((n>>i)&1)==1)
//            {
//                count++;
//            }
//            else
//            {
//                maxCount=Math.max(maxCount,count);
//                count=0;
//            }
//        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println(countOnes(31));
    }
}
