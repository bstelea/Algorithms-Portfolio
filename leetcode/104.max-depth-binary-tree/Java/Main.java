public class Main {
    public static void test(Solution solution) {
        TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
        TreeNode root3 = null;
        TreeNode root4 = new TreeNode(0);
        if (solution.maxDepth(root1) == 3) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.maxDepth(root2) == 2) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
        if (solution.maxDepth(root3) == 0) {
            System.out.println("Test 3 passed!");
        } else {
            System.out.println("Test 3 failed!");
        }
        if (solution.maxDepth(root4) == 1) {
            System.out.println("Test 4 passed!");
        } else {
            System.out.println("Test 4 failed!");
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }
}
