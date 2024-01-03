import java.util.Arrays;
public class MaxSum {
    public static void main(String[] args) {
        long a[] = {1,2,3,4,5,6,7,8};
        System.out.println(maxSumWithK(a,4,2));
    }
    public static long maxSumWithK(long a[], long n, long k)
    {
        Arrays.sort(a);
        long sum=0;
        int i=a.length-1;
        while (i>=0&&(k>=0||a[i]>=0)) {
            sum+=a[i];
            i--;
            k--;
        }
        return sum;
    }
}
