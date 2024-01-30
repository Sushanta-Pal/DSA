import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class unique {
    public static void main(String[] args) {
        unique u=new unique();
        int num=14;
        System.out.println(u.numberOfSteps(num));
    }
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> s=new HashSet<>();
        int a=1;
        for(int i=1;i<arr.length;i++){
                if (arr[i]!=arr[i-1]) {
                   if (s.contains(a)) {
                    return false;
                   }
                   else s.add(a);

                    a=1;
                }else
                 a++;
        }
        if (s.contains(a)) {
            return false;
           }
           else s.add(a);
        return true;
        
    }
    public int numberOfSteps(int num) {
        int s=0;
        while ( num>0) {
            if (num%2==0) {
                num /=2;
                s++;
            }else {
                num-=1;
                s++;
            }
        }
        return s;
    }

}
