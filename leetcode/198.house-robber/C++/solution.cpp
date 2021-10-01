#include <iostream>
#include <vector>
#include <assert.h>
using namespace std;

class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n + 1, 0);
        if (n == 1) {
            return nums[0];
        }
        dp[1] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i + 1] = (dp[i] > nums[i] + dp[i - 1]) ? dp[i] : (nums[i] + dp[i - 1]);
        }
        
        return dp[n];
    }
};

void test(Solution solution) {
    vector<int> nums1 {1, 2, 3, 1};
    vector<int> nums2 {2, 7, 9, 3, 1};
    assert(solution.rob(nums1) == 4);
    assert(solution.rob(nums2) == 12);
    cout << "All test cases pass!\n";
}

int main() {
    Solution solution;
    test(solution);
    return 0;
}