import java.util.Arrays;
import java.util.List;
public class Dp {
    public static void main(String[] args) {
        
    }
    public int minFallingPathSum(int[][] matrix) {
        int  n =matrix.length;
        if (n==1) {
            return matrix[0][0];
        }
        int dp[][]=new int[n][n];
        for(int[] row:dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans, solve(matrix,0,i,dp));
        }
        return ans;
    }
    private int solve(int[][] matrix, int row, int col, int[][] dp) {
      if (dp[row][col]!=Integer.MAX_VALUE) {
        return dp[row][col];
      }

      if (row==matrix.length-1) {
        return matrix[row][col];
      }
      int left=Integer.MAX_VALUE;
      int right=Integer.MAX_VALUE;
      int down=Integer.MAX_VALUE;
      if (col>0) {
        left=solve(matrix, row+1, col-1, dp);
      }
       down=solve(matrix, row+1, col, dp);
      if(col<matrix.length-1)
     right=solve(matrix, row+1, col+1, dp);
        dp[row][col]=Math.min(left, Math.min(right, down))+matrix[row][col];
        return dp[row][col];
    }
}
public boolean isAcronym(List<String> words, String s) {
  if(words.size()!=s.length()) return false;
  for(int i=0;i<words.size();i++)
  {
    if (words.get(i).charAt(0)!=s.charAt(i)) {
      return false;
    }
  }
  return true;

}