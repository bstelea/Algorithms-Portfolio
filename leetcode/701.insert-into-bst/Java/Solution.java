public class Solution {
    public void printInOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " -> ");
        printInOrder(root.left);
        printInOrder(root.right);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val); 
        }

        return root;
    }
}
