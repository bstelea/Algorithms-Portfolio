import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans;

    public void backtrack(int k, int n, int start, List<Integer> comb) {
        if (comb.size() == k) {
            List<Integer> copy = new ArrayList<>(comb);
            ans.add(copy);
            return;
        }

        for (int i = start; i <= n; i++) {
            comb.add(i);
            backtrack(k, n, i + 1, comb);
            comb.remove(comb.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        this.ans = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>());
        return ans;
    }
}
