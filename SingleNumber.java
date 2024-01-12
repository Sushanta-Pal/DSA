import java.util.Arrays;
public class SingleNumber {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=2;i<nums.length;i+=3){
            if (nums[i]!=nums[i-2]) {
                break;
            }
        }
        if (nums.length==i-1) {
            return nums[i-2];
        }
        if (nums[i-2]!=nums[i-1]) {
            return nums[i-2];
        }else return nums[i];
    }
}
