import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void visit(TreeNode node, List<Integer> ans) {
        if (node == null)
            return;
        visit(node.left, ans);
        ans.add(node.val);
        visit(node.right, ans);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        visit(root, ans);
        return ans;
    }
}
