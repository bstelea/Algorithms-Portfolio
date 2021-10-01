from typing import List

# You are a professional robber planning to rob houses along a street. 
# Each house has a certain amount of money stashed, the only constraint stopping you 
# from robbing each of them is that adjacent houses have security systems connected 
# and it will automatically contact the police if two adjacent houses were broken into 
# on the same night.
#
# Given an integer array nums representing the amount of money of each house, 
# return the maximum amount of money you can rob tonight without alerting the police.

class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        if (n == 1):
            return nums[0]
        dp = [0] * (n + 1)
        dp[1] = nums[0]
        for i in range(1, n):
            dp[i + 1] = max(dp[i], nums[i] + dp[i - 1])
        print(dp)
        return dp[n]

def test(solution: Solution) -> None:
    nums1 = [1, 2, 3, 1]
    nums2 = [2,7,9,3,1]
    if solution.rob(nums1) == 4:
        print("Test 1 passed!")
    else:
        print("Test 1 failed!")
    if solution.rob(nums2) == 12:
        print("Test 2 passed!")
    else:
        print("Test 2 failed!")

if __name__ == "__main__":
    solution = Solution()
    test(solution)