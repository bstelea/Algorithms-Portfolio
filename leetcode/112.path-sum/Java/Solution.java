import java.util.Iterator;
import java.util.Stack;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        stack.push(root);
        sumStack.push(targetSum - root.val);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            Integer currentSum = sumStack.pop();
            if (current.left == null && current.right == null && currentSum == 0)
                return true;
            
            if (current.left != null) {
                stack.push(current.left);
                sumStack.push(currentSum - current.left.val);
            }

            if (current.right != null) {
                stack.push(current.right);
                sumStack.push(currentSum - current.right.val);
            }
        }
        return false;
    }
}
