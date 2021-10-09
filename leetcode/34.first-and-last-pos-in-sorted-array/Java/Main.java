import java.util.Arrays;

public class Main {
    public static void test(Solution solution) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int[] nums3 = {};
        int[] res1 = solution.searchRange(nums1, 8);
        if (res1[0] == 3 && res1[1] == 4) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }

        int[] res2 = solution.searchRange(nums2, 6);
        if (res2[0] == -1 && res2[1] == -1) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }

        int[] res3 = solution.searchRange(nums3, 0);
        if (res3[0] == -1 && res3[1] == -1) {
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
