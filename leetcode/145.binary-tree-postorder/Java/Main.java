public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode root2 = null;
        TreeNode root3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(1, new TreeNode(2), null);
        TreeNode root5 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(sol.postorderTraversal(root).toString());
        System.out.println(sol.postorderTraversal(root2).toString());
        System.out.println(sol.postorderTraversal(root3).toString());
        System.out.println(sol.postorderTraversal(root4).toString());
        System.out.println(sol.postorderTraversal(root5).toString());
    }
}
