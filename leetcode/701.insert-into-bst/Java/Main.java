public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        solution.printInOrder(root);
        System.out.println();        
        solution.insertIntoBST(root, 5);
        solution.printInOrder(root);
        System.out.println();
    }
}
