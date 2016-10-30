import java.util.Scanner;


public class AnagramOfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            String s = sc.nextLine();*/
		String s = "aabb";
            int res=longestPalindrome(s);
            System.out.println(res);
        //}
        //sc.close();
    }
    
    	/*public static int minInsertionPalindrome(String a,int begin,int end)
    {
    	
    	char[] s = a.toCharArray();
    	//System.out.println(s.length+" "+end);
        if (begin == end) return 0;
    if (begin == end - 1) return (s[begin] == s[end])? 0 : 1;
    if (s[begin] == s[end]) {
        return minInsertionPalindrome(s.toString(),begin + 1,end - 1);
    }
    return 1 + Math.min(minInsertionPalindrome(s.toString(),begin + 1,end),minInsertionPalindrome(s.toString(),begin,end - 1));

        int[] a = new int[26]; 
        int OodOccurance=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            a[c-'a']++;
            //System.out.println(c+" "+a[c-'a']);
            //System.out.println(a[c-'a']);
        }
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]!=0){
        	System.out.println("in the loop:"+i+" "+a[i]);}
                if(a[i]%2==1)
                {
                	//System.out.println(i+" "+a[i]);
                    OodOccurance++;  
                }
            
            
        }
        
        System.out.println(OodOccurance);
        if(OodOccurance==0 || OodOccurance==1)
                {
                System.out.println(OodOccurance);
            }
        else
            {
        System.out.println(OodOccurance-1);
            }
    }
*/
		
	public static int longestPalindrome(String s) {
		if (s.isEmpty()) {
			return 0;
		}
	 
		if (s.length() == 1) {
			return 0;
		}
	 
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
	 
			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
	 
		return s.length()-longest.length();
	}
	
	public static String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
	

}
