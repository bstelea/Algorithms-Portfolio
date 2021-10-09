public class Main {
    public static void test(Solution solution) {
        int[][] dungeon1 = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        int[][] dungeon2 = {{0}};
        if (solution.calculateMinimumHP(dungeon1) == 7) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.calculateMinimumHP(dungeon2) == 1) {
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
