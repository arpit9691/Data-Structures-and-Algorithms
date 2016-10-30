//import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

 
public class PostfixEvaluator {
	
	
	public static long StackOps(String str){

        //Stack<Integer> st = new Stack<Integer>();
        Deque<Integer> args = new LinkedList<Integer>();
        int op1=0,op2=0;

        int result;

        if(str.length() > 200000)
            return -1;

        if(!str.matches("^[0-9*+]+$")) {System.out.println("Divide mila");return -1;}

        for(char ch:str.toCharArray()){

            if(ch == '+' || ch == '*'){
               // System.out.println(st.size());
                /*if(st.size() > 1) {
            	  op1 = st.pop();
                  op2 = st.pop();
              }*/
            	if(args.size() > 1) {
            		op1 = args.pop();
                    op2 = args.pop();
                }
                  
                else
                    return -1;

                if(ch == '+'){
                    result = op1 + op2;
                }else{
                    result = op1 * op2;
                }

                if(result > Integer.MAX_VALUE)
                    return -1;
                System.out.println(result);
                //st.push(result);
                args.push(result);
            }else {
                try {
                    //st.push(Integer.parseInt(new String(ch + "")));
                	args.push(Integer.parseInt(new String(ch + "")));
                }catch(Exception e){
                    return -1;
                }
            }

        }
        //return st.pop();
        return args.pop();
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calci:"+ StackOps("13+62*7+*"));

	}

}
