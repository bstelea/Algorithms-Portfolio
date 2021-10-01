public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode root2 = null;
        TreeNode root3 = new TreeNode(1);
        System.out.println(sol.preorderTraversal(root).toString());
        System.out.println(sol.preorderTraversal(root2).toString());
        System.out.println(sol.preorderTraversal(root3).toString());
    }
}
