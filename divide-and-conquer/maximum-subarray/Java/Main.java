import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findMaximumSubarray(nums, 0, nums.length - 1)));
    }
}