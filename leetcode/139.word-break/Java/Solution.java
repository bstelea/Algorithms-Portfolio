import java.util.List;

/*
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence 
 * of one or more dictionary words.
 * 
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
*/

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[n] = true;
        for (int i = n - 1; i >= 0; i--) {
            for (String word : wordDict) {
                if (i + word.length() <= n && word.equals(s.substring(i, i + word.length()))) {
                    dp[i] = dp[i + word.length()];
                }
                if (dp[i])
                    break;
            }
        }
        return dp[0];
    }
}
