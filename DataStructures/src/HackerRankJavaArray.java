/**
 * Created by Arpit on 9/9/2016.
 */
public class HackerRankJavaArray {

    public static void check(int[] a,int l,int jl)
    {
        int j=0;



            while(j<a.length-1 && j>=0)
            {
                System.out.println("HI");
                System.out.println(j);
                if(a[j+1]!=0 && j==0)
                {
                    if(j+jl<a.length && a[j+jl]!=0)
                    {
                        System.out.println("NO");

                    }

                }
                if(a[j+1]==0)
                {
                    j++;
                }
                if(j+jl>a.length-1 && a[j]==0)
                {
                    System.out.println("This!!!");

                    System.out.println("YES");
                    break;
                }
                if(j+jl<a.length && a[j+jl]==0)
                {
                    if(j+jl==a.length-1)
                    {
                        System.out.println("YES");
                        break;
                    }
                    j=j+jl;
                }
                if( a[j+1] !=0 && j+jl<a.length && a[j+jl]!=0)
                {
                    if(j>0 && a[j-1]==0)
                    {
                        j--;
                        if(a[j+jl]==0)
                        {
                            j=j+jl;
                        }
                        else
                        {
                            System.out.println("NO");
                            break;
                        }
                    }

                }

            }


    }

    public static void check1(int[] a,int m)
    {
        int j=0;
        while(j<a.length && (a[j]==0))
        {
            if(j+1<a.length && a[j+1]==0)
            {
                j++;
            }
            else if(j+m>=a.length)
            {
                System.out.println("YES");
                break;
            }
            else if(j+m<a.length && a[j+m]==0)
            {
                if((j+m)==a.length-1)
                {
                    System.out.println("YES");
                    break;
                }
                j=j+m;
            }
            else if(j-1>=0 && a[j-1]==0)
            {
                j--;
                if(a[j+m]!=0)
                {
                    System.out.println("NO");
                }
            }
        }
    }


    public static void main(String args[])
    {
        int[] a = {0 ,1 ,0 ,1 ,0 ,1};
        //check(a,6,2);
        check1(a,2);
    }
}
