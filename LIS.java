public class LIS {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int[] arr=new int[nums.length];
        arr[0] =nums[0];
        int i=1;
        int j=0;
        while (i<nums.length) {
            if (nums[i]<=arr[j]) {
                int l=j-1;
                while (l>=0 && arr[l]>=nums[i]) {
                   l--;
                }
                arr[l+1]=nums[i];
            }
            else{
                arr[++j]=nums[i];
            }
            i++;
        }
        return j+1;
    }
}
