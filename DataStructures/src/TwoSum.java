import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arpit on 9/22/2016.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        /*List<Integer> list=new ArrayList<Integer>();
        int[] arr=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(target-nums[i]) && list.indexOf(target-nums[i])!=i)
            {
                arr[0]=i;
                arr[1]=list.indexOf(target-nums[i]);
                return arr;
            }
        }
       return arr; */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[])
    {
        int[]a={3,2,4};

        int[] b=twoSum(a,6);

        System.out.println(b[0]);
        System.out.println(b[1]);

    }
}
