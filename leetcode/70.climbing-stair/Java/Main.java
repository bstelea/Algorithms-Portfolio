public class Main {
    public static void test(Solution sol) {
        int n1 = 2, n2 = 3;
        if (sol.climbStairs(n1) == 2) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (sol.climbStairs(n2) == 3) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        test(sol);
    }
}
