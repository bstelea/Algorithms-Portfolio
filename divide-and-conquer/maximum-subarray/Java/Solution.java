public class Solution {
    public int[] findMaximumCrossingSubarray(int[] nums, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = low, maxRight = high;
        for (int i = mid; i >= low; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        sum = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum += nums[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }

    public int[] findMaximumSubarray(int[] nums, int low, int high) {
        int[] res = new int[3];
        if (high == low) {
            return new int[]{low, high, nums[low]};
        }
        int mid = low + (high - low) / 2;
        int[] aux;
        int leftLow, leftHigh, leftSum, rightLow, rightHigh, rightSum, crossLow, crossHigh, crossSum;
        aux = findMaximumSubarray(nums, low, mid);
        leftLow = aux[0];
        leftHigh = aux[1];
        leftSum = aux[2];
        aux = findMaximumSubarray(nums, mid + 1, high);
        rightLow = aux[0];
        rightHigh = aux[1];
        rightSum = aux[2];
        aux = findMaximumCrossingSubarray(nums, low, mid, high);
        crossLow = aux[0];
        crossHigh = aux[1];
        crossSum = aux[2];
        if (leftSum >= rightSum && leftSum >= crossSum) {
            return new int[]{leftLow, leftHigh, leftSum};
        } else if (rightSum >= leftSum && rightSum >= crossSum) {
            return new int[]{rightLow, rightHigh, rightSum};
        } 
        return new int[]{crossLow, crossHigh, crossSum};
    }
}
