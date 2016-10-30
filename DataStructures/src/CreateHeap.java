/**
 * Created by Arpit on 9/26/2016.
 */
public class CreateHeap {
    public static void main(String args[])
    {
        BinaryHeap hp=new BinaryHeap();
        hp.insert(1);
        hp.insert(5);
        hp.insert(10);

        System.out.println("HI");
        System.out.println(hp);

        while(!(hp.isEmpty()))
        {
            System.out.println("HI");
            int temp=hp.delete();

            System.out.println(temp+" "+hp);
        }
    }
}
