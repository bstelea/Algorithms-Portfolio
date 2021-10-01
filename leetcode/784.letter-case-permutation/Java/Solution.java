import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void backtrack(String s, int index, StringBuilder curr, List<String> ans) {
        if (index == s.length()) {
            ans.add(curr.toString());
            return;
        }
        char c = s.charAt(index);
        if (Character.isLetter(c)) {
            StringBuilder lower = new StringBuilder(curr).append(Character.toLowerCase(c));
            StringBuilder upper = new StringBuilder(curr).append(Character.toUpperCase(c));
            backtrack(s, index + 1, lower, ans);
            backtrack(s, index + 1, upper, ans);
        } else {
            backtrack(s, index + 1, curr.append(c), ans);
        }
        
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s, 0, new StringBuilder(), ans);
        return ans;
    }
}
