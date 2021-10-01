import java.util.List;

public class Main {
    public static void printListOfList(List<List<Integer>> list) {
        System.out.print("[ ");
        for (List<Integer> l : list) {
            System.out.print(l.toString() + " ");
        }
        System.out.println("]");
    }
    
    public static void test(Solution solution) {
        TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode root2 = new TreeNode(1);
        TreeNode root3 = null;
        printListOfList(solution.levelOrder(root1));
        printListOfList(solution.levelOrder(root2));
        printListOfList(solution.levelOrder(root3));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }
}
