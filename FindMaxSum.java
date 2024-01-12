public class FindMaxSum {
    public static void main(String[] args) {
        FindMaxSum f=new FindMaxSum();
        System.out.println(f.FindMaxSum(new int[]{3,2,5,10,7}, 5));
    }
    public int FindMaxSum(int arr[], int n)
    {
        if (n==0) {
            return -1;
        }
        if (n==1) {
            return arr[0];
        }
        if (n==2) {
           return Math.min(arr[0], arr[1]) ;
        }
        
        int pre1=arr[0];
        int pre2=arr[1];
        int max=Math.min(pre1, pre2);
        for(int i=2;i<n;i++){
            int t=pre2;
            pre2=arr[i]+pre1;
            pre1=t;
            max=Math.max(max, pre2);
        }
        return max;
    }

}
