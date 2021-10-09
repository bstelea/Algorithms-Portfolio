public class Main {
    public static void test(Solution solution) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {1};

        int res1 = solution.search(nums1, 0);
        if (res1 == 4) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.search(nums2, 3) == -1) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
        if (solution.search(nums3, 0) == -1) {
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
