public class Main {
    public static void test(Solution solution) {
        int[][] matrix1 = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int[][] matrix2 = {{-19, 57}, {-40, -5}};
        int[][] matrix3 = {{-48}};
        if (solution.minFallingPathSum(matrix1) == 13) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.minFallingPathSum(matrix2) == -59) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
        if (solution.minFallingPathSum(matrix3) == -48) {
            System.out.println("Test 3 passed!");
        } else {
            System.out.println("Test 3 failed!");
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }
}
