#include <stdio.h>
#include <assert.h>

int rob(int* nums, int numsSize){
    int dp[numsSize + 1];
    if (numsSize == 1) 
        return nums[0];
    dp[0] = 0;
    dp[1] = nums[0];
    for (int i = 1; i < numsSize; i++) {
        dp[i + 1] = (dp[i] > nums[i] + dp[i - 1]) ? dp[i] : (nums[i] + dp[i - 1]);
    }
    return dp[numsSize];
}

void test() {
    int nums1[] = {1, 2, 3, 1};
    int nums2[] = {2, 7, 9, 3, 1};
    assert(rob(nums1, 4) == 4);
    assert(rob(nums2, 5) == 12);
    printf("All tests pass!\n");
}

int main(int argc, char const *argv[])
{
    test();
    return 0;
}
