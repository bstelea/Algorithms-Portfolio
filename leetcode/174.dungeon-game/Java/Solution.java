import java.util.Arrays;

/**
 * 
 */

public class Solution {
    public int cap(int val) {
        return (val <= 0) ? 1 : val;
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m + 1][n + 1];
        // Init dp[princess]
        dp[m - 1][n - 1] = cap(1 - dungeon[m - 1][n - 1]);
        dp[m][n] = Integer.MAX_VALUE;
        dp[m - 1][n] = Integer.MAX_VALUE;
        dp[m][n - 1] = Integer.MAX_VALUE;
        // Init dp last row
        for (int j = n - 2; j >= 0; j--) {
            dp[m][j] = Integer.MAX_VALUE;
            dp[m - 1][j] = cap(dp[m - 1][j + 1] - dungeon[m - 1][j]);
        }
        // Init dp last col
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n] = Integer.MAX_VALUE;
            dp[i][n - 1] = cap(dp[i + 1][n - 1] - dungeon[i][n - 1]);
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = cap(Math.min(dp[i][j + 1], dp[i + 1][j]) - dungeon[i][j]);
            }
        }
        
        return dp[0][0];   
    }
}
