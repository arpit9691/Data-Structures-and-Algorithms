/**
 * Created by Arpit on 10/21/2016.
 */

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;


    /**
     * Created by adwaitkaley on 10/20/16.
     */
    public class IBMPassage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String str[] = input.split("\\|");
            // TreeMap<String,String> stringTreeMap = new TreeMap<String, String>();
            List<String> list = new ArrayList<String>();
            String temp = null;
            for(int i =0;i<str.length;i++){
                temp = str[i];
                temp = temp.trim().replaceAll(" +", " ").toLowerCase();
                temp = temp.replaceAll("[^a-zA-Z0-9\\s]","");



                if(list.contains(temp)){
                    String org= str[list.indexOf(temp)];
                    if(str[i].length() < org.length()){
                        list.set(list.indexOf(temp),"");
                    }else {
                        list.add("");
                    }
                } else {
                    list.add(temp);
                }


            }


            StringBuilder res = new StringBuilder();
            boolean done=false; int count=0;
            for(int i=0;i<list.size();i++){
                String curr = list.get(i);
                for( int j=0;j<list.size();j++){

                    if(done)
                    {
                        done=false;
                        break;
                    }
                    if(j!=i && list.get(j)!="" && curr.contains(list.get(j)))
                    {
                        res.append(str[i]+"|");count++;
                        done=true;}
                }

            }
            String f="";
            if(count==1)
            {
                int index=res.toString().lastIndexOf('|');
                f=res.toString().substring(0,index);
            }
            else
            {
                f=res.toString();
            }
            System.out.println(f);

        }
    }

