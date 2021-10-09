public class Main {
    public static void test(Solution solution) {
        int[] list1 = {2, 2, 1};
        int[] list2 = {4, 1, 2, 1, 2};
        int[] list3 = {1};
        if (solution.singleNumber(list1) == 1) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.singleNumber(list2) == 4) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
        if (solution.singleNumber(list3) == 1) {
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
