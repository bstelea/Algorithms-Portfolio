import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans;
    public void backtracking(List<Integer> nums2, int k, List<Integer> perm) {
        if (k == 0) {
            List<Integer> copy = new ArrayList<>(perm);
            this.ans.add(copy);
            return;
        }

        for (int i = 0; i < k; i++) {
            Integer x = nums2.get(0);
            nums2.remove(0);
            perm.add(x);
            backtracking(nums2, k - 1, perm);
            perm.remove(perm.size() - 1);
            nums2.add(x);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        this.ans = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums2.add(nums[i]);
        }
        
        backtracking(nums2, n, new ArrayList<>());
        return ans;
    }
}
