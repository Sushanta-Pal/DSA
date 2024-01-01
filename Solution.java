import java.util.Arrays;

public class Solution {
    static int[][] memo = new int[31][1001];
    static long M = 1000000007;

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2, 6, 3));
    }

    public static int numRollsToTarget(int n, int k, int target) {
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        return helper(n, k, target);
    }

    private static int helper(int n, int k, int target) {
        if (memo[n][target] != -1) {
            return memo[n][target];
        }
        if (target < 0) {
            return 0;
        }
        if (n == 0) {
            return (target == 0) ? 1 : 0;
        }
        int ans = 0;
        for (int i = 1; i <= k; i++) {
            if (target-i>=0) {
                
            
            ans += numRollsToTarget(n - 1, k, target - i) % M;
            }
        }
        return memo[n][target] = ans;
    }
}
