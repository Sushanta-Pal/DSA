public class Rolls {
    public static void main(String[] args) {
        int n = 1, k = 6, target = 3;
        System.out.println(numRollsToTarget(n, k, target));
    }
    private static final long M = 1000000007;
    public static int numRollsToTarget(int n, int k, int target) {
        int[][] t = new int[n + 1][target + 1];

        // t[i][j] = total ways to obtain j from exactly i dices

        t[0][0] = 1;
        /*
         * if (n == 0 && target == 0) we have found the target with all dices Or,
         * understand it like this : To obtain target 0 with 0 dices, how many ways : 1
         */

        for (int i = 1; i <= n; i++) { // coin size loop (from coin change-2)
            for (int j = 1; j <= target; j++) { // target loop (from coin change-2)

                // Now since coin (here dice) has faces, so we need a loop for that too
                for (int f = 1; f <= k; f++) {
                    // face value should always be <= target
                    // so,
                    if (f <= j) {
                        t[i][j] = (int) ((t[i][j] + t[i - 1][j - f]) % M);
                    }
                }
            }
        }

        return t[n][target];
    }
}
/*Number of Dice Rolls With Target Sum
Solved
Medium
Topics
Companies
Hint
You have n dice, and each dice has k faces numbered from 1 to k.

Given three integers n, k, and target, return the number of possible ways (out of the kn total ways) to roll the dice, so the sum of the face-up numbers equals target. Since the answer may be too large, return it modulo 109 + 7.

 

Example 1:

Input: n = 1, k = 6, target = 3
Output: 1
Explanation: You throw one die with 6 faces.
There is only one way to get a sum of 3.
Example 2:

Input: n = 2, k = 6, target = 7
Output: 6
Explanation: You throw two dice, each with 6 faces.
There are 6 ways to get a sum of 7: 1+6, 2+5, 3+4, 4+3, 5+2, 6+1. */
