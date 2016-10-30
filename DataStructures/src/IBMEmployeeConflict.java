import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arpit on 10/5/2016.
 */
public class IBMEmployeeConflict {

    public static String solveConflict(Map<String, String> hm,String s1,String s2)
    {
        boolean done=false;
        String answer="";
        while(!(done))
        {
            if(hm.get(s1).intern()==hm.get(s2).intern())
            {
                done=true;
                answer= hm.get(s1);
            }
            else if(hm.get(s1).intern()==s2.intern())
            {
                done=true;
                answer=  s2;
            }
            else if(hm.get(s2).intern()==s1.intern())
            {
                done=true;
                answer=  s1;
            }
            else
            {
                s1=hm.get(s1);
                s2=hm.get(s2);
            }
        }
        return answer;
    }
    public static void main(String args[])
    {
        //String input="Frank->Mary,Mary->Sam,Mary->Bob,Sam->Katie,Sam->Pete,Bob->John,Bob,Katie";
        String input="Sam->Pete,Pete->Nancy,Sam->Katie,Mary->Bob,Frank->Mary,Mary->Sam,Bob->John,Sam,John";
        Map<String,String> hm=new HashMap<String, String>();
        String [] initial=input.split(",");
        for(int i=0;i<initial.length-2;i++)
        {
            String [] temp=initial[i].split("->");
            hm.put(temp[1],temp[0]);

        }

        /*hm.put("Mary","Frank");
        hm.put("Sam","Frank");
        hm.put("Bob","Mary");
        hm.put("Katie","Sam");
        hm.put("Pete","Sam");
        hm.put("John","Bob");*/

        String employee1=initial[initial.length-2];
        String employee2=initial[initial.length-1];

        System.out.println(solveConflict(hm, employee1, employee2));

    }
}
