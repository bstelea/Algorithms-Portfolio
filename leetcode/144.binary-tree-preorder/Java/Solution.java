import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void visit(TreeNode node, List<Integer> ans) {
        if (node == null)
            return;
        ans.add(node.val);
        visit(node.left, ans);
        visit(node.right, ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        visit(root, ans);
        return ans;
    }
}
