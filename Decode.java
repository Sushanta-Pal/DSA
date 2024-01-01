import java.util.Arrays;
public class Decode {
    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }
    public static int[] memo = new int[101];

    public static int numDecodings(String s) {
        int n = s.length();
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return solve(0, s, n);
    }

    private static int solve(int i, String s, int n) {
        if (memo[i] != -1) {
            return memo[i];
        }

        if (i == n) {
            return memo[i] = 1; // one valid split done
        }

        if (s.charAt(i) == '0') {
            return memo[i] = 0; // not possible to split
        }

        int result = solve(i + 1, s, n);

        if (i + 1 < n) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                result += solve(i + 2, s, n);
            }
        }

        return memo[i] = result;
    }
}
/*91. Decode Ways
Solved
Medium
Topics
Companies
A message containing letters from A-Z can be encoded into numbers using the following mapping:

'A' -> "1"
'B' -> "2"
...
'Z' -> "26"
To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:

"AAJF" with the grouping (1 1 10 6)
"KJF" with the grouping (11 10 6)
Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

Given a string s containing only digits, return the number of ways to decode it.

The test cases are generated so that the answer fits in a 32-bit integer.

 

Example 1:

Input: s = "12"
Output: 2
Explanation: "12" could be decoded as "AB" (1 2) or "L" (12). */
