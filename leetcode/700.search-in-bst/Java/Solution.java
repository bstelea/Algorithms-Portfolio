public class Solution {
    public void printInOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " -> ");
        printInOrder(root.left);
        printInOrder(root.right);
    } 

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        
        if (root.val == val) {
            printInOrder(root);
            return root;
        } 
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
