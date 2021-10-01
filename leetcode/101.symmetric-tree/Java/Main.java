public class Main {
    public static void test(Solution solution) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode root2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
        if (solution.isSymmetric(root1) == true) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.isSymmetric(root2) == false) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }
}
