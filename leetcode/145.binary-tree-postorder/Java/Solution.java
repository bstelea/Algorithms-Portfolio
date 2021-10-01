import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void visit(TreeNode node, List<Integer> ans) {
        if (node == null)
            return;
        visit(node.left, ans);
        visit(node.right, ans);
        ans.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        visit(root, ans);
        return ans;
    }
}
