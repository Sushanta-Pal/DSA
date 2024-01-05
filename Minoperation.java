import java.util.HashMap;
import java.util.Map;

public class Minoperation {
    public static void main(String[] args) {
        int[] nums = {2,1,2,2,3,3};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int total=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i: nums){
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i)+1);
            }else mp.put(i,1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                return -1; 
            }
            int ans =0;
            int rem=entry.getValue()%3;
            ans=entry.getValue()/3;
            if (rem==0) {
                total+=ans;
            }else if (rem==1) {
                total+=(ans-1)+2;
            }else total+=ans+1;
        }
        return total;
    }
}
