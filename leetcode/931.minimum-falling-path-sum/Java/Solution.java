import java.util.Arrays;

/**
 * Example 1:
 * Input: matrix = [[2,1,3],[6,5,4],[7,8,9]] 
 * Output: 13
 * Explanation: There are two falling paths with a minimum sum underlined below:
 *
 * [[2,1,3],      [[2,1,3],
 *  [6,5,4],       [6,5,4],
 *  [7,8,9]]       [7,8,9]] 
 */

public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        // Init dp
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = matrix[n - 1][i];
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int SW = Integer.MAX_VALUE;
                int SE = Integer.MAX_VALUE;
                int S = dp[i + 1][j];
                if (j > 0) {
                    SW = dp[i + 1][j - 1];
                }
                if (j < n - 1) {
                    SE = dp[i + 1][j + 1];
                }
                dp[i][j] = matrix[i][j] + Math.min(Math.min(SW, S), SE);
            }
        }
        Arrays.sort(dp[0]);
        return dp[0][0];
    }
}
