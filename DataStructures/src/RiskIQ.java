
public class RiskIQ {
	
	static int solution(int[] A) {
        int n = A.length;

        int result = 0;
        for (int i = 0; i < n-1 ; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        //System.out.println("Result:"+result);
        int r = 0;
        
        for (int i = 0; i < n; i++) {
        	int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i]  )
                    count = count + 1;
                else{
                    count = count - 1;}
            }
            if (i < n -1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else{
                    count = count - 1;}
            }

            r = Math.max(r, count);
        }
        return result + r;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {0,0,1};
	        int[] arr1 = {1,0,0};
	        int[] arr2 = {1,1,0,1,0,0};
	        int[] arr3 = {0,0,0};
	        int[] arr4 = {0,1,0};
	        int[] arr5 = {1,1,1,1};
	        int[] arr6 = {-500,-500};
	        int[] arr7 = {0,0,1,0,0,1,1,1,0,1,1};
	        System.out.println("0,0,1:"+solution(arr));
	        System.out.println("1,0,0:"+solution(arr1));
	        System.out.println("1,1,0,1,0,0:"+solution(arr2));
	        System.out.println("0,0,0:"+solution(arr3));
	        System.out.println("0,1,0:"+solution(arr4));
	        System.out.println("1,1,1,1:"+solution(arr5));
	        System.out.println("1,1:"+solution(arr6));
	        System.out.println("0,0,1,0,0,1,1,1,0,1,1:"+solution(arr7));

	}

}
