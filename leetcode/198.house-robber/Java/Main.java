public class Main {
    public static void test(Solution sol) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 7, 9, 3, 1};
        if (sol.rob(nums1) == 4) {
            System.out.println("Test1 passed!");
        } else {
            System.out.println("Test1 failed!");
        }
        if (sol.rob(nums2) == 12) {
            System.out.println("Test2 passed!");
        } else {
            System.out.println("Test2 failed!");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        test(sol);
    }
}
