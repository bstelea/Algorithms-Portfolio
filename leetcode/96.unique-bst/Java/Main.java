public class Main {
    public static void test(Solution solution) {
        if (solution.numTrees(3) == 5) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.numTrees(1) == 1) {
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
