/**
 * Created by Arpit on 9/30/2016.
 */
public class RotatedArrayFindElement {

    public static int findElement(int[] a,int start,int end,int x)
    {
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;


            if(a[mid]==x)
            {
                return mid;
            }
            if(a[start]<=a[mid])
            {
                if(x>=a[start] && x<a[mid])
                {
                    return findElement(a,start,mid-1,x);
                }
                else {
                    return findElement(a,mid+1,end,x);
                }
            }
            else
            {
                if(x>a[mid] && x<=a[end])
                {
                    return findElement(a,mid+1,end,x);
                }
                else {
                    return findElement(a,start,mid-1,x);
                }
            }




    }
    public static void main(String args[])
    {
        int[] a={4,5,1,2,3};
        System.out.println(findElement(a, 0, 4, 4));
    }
}
