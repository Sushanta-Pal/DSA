import java.util.Arrays;
public class Errors {
    public static void main(String[] args) {
        int[] nums={1,3,3,4};
        int[] nums1={1,2,2,4};

        System.out.println(Arrays.toString(findErrorNums(nums1)));
    }
    public static int[] findErrorNums(int[] nums) {
       
       for(int i=1;i<nums.length;i++){
         
        if (nums[i]==nums[i-1]) {
                if (i==nums[i]-1) {
                    return new int[]{nums[i]-1,nums[i]};
                }
                else return new int[]{nums[i-1],nums[i]+1};
            
        }
        
       }
       return new int[]{-1,-1};
    }
}
