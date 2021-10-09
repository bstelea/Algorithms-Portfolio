public class Main {
    public static void test(Solution solution) {
        if (solution.isPowerOfTwo(1)) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.isPowerOfTwo(16)) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
        if (!solution.isPowerOfTwo(3)) {
            System.out.println("Test 3 passed!");
        } else {
            System.out.println("Test 3 failed!");
        }
        if (solution.isPowerOfTwo(4)) {
            System.out.println("Test 4 passed!");
        } else {
            System.out.println("Test 4 failed!");
        }
        if (!solution.isPowerOfTwo(5)) {
            System.out.println("Test 5 passed!");
        } else {
            System.out.println("Test 5 failed!");
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }
}
