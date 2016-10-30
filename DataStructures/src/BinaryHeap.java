import java.util.ArrayList;
import java.util.List;


/**
 * Created by Arpit on 9/25/2016.
 */
public class BinaryHeap {

    List<Integer> list;
    public BinaryHeap()
    {
        list=new ArrayList<Integer>();
    }

    public void shiftUp()
    {
        int k=list.size()-1;
        while(k>0)
        {
        if(list.get(k)>list.get((k-1)/2))
        {
            Integer temp=list.get((k-1)/2);
            list.set((k-1)/2,list.get(k));
            list.set(k,temp);
            k=(k-1)/2;

        }
            else
        {
            break;
        }
        }
    }

    public void shiftDown()
    {
        int k=0;
        int l=2*k+1;

        while(l<list.size())
        {
            int r=l+1; int max=0;
            if(r<list.size()) {
                if (list.get(l) > list.get(r)) {
                    max = l;
                } else {
                    max = r;
                }
            }
                if(list.get(k)<list.get(max))
                {
                    int temp=list.get(k);
                    list.set(k,list.get(max));
                    list.set(max,temp);
                    k=max;
                    System.out.println("k:"+k);
                    l=2*k+1;
                    System.out.println("l:"+l);
                }
                else
                {
                    break;
                }

        }

    }
    public void insert(int data)
    {
        list.add(data);
        shiftUp();
    }

    public int delete()
    {
        //int k=0;


        if(list.size()==0)
        {
            System.out.println("Empty");
        }
        if(list.size()==1)
        {
            return list.remove(0);
        }
        int hold=list.get(0);
        list.set(0,list.remove(list.size()-1));
        //System.out.println("HI:"+this);
        shiftDown();
        return hold;
    }

    public int size()
    {
        return list.size();
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public String toString()
    {
        return list.toString();
    }
}
