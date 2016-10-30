import java.util.Arrays;

/**
 * Created by Arpit on 10/12/2016.
 */
public class BulbSwitcher {

    public static int countBulb(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        int[] a=new int[n];
        Arrays.fill(a, 1);
        int k=0; int count=0;
        for(int i=1;i<n;i++)
        {
            k=n/i+1;
            int temp=i;
            while(k>0 && temp<n)
            {
                if(a[temp]==0)
                {
                    a[temp]=1;
                }
                else {
                    a[temp] = 0;
                }
                k--;
                temp=temp+i+1;
            }


        }

        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        System.out.println(countBulb(4));
    }
}
