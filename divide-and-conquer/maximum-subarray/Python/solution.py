from typing import List, Tuple
import math

def findMaxCrossingSubarray(nums:List[int], low:int, mid:int, high:int) -> Tuple[int, int, int]:
    leftSum, rightSum, maxLeft, maxRight, sum = float('-inf'), float('-inf'), low, high, 0
    for i in range(mid, low - 1, -1):
        sum += nums[i]
        if sum > leftSum:
            leftSum = sum
            maxLeft = i

    sum = 0
    for i in range(mid + 1, high + 1):
        sum += nums[i]
        if sum > rightSum:
            rightSum = sum
            maxRight = i
    
    return (maxLeft, maxRight, leftSum + rightSum)

def findMaxSubarray(nums:List[int], low:int, high:int) -> Tuple[int, int, int]:
    if high == low:
        return (low, high, nums[low])
    mid = math.floor(low + (high - low) / 2)
    (leftLow, leftHigh, leftSum) = findMaxSubarray(nums, low, mid)
    (rightLow, rightHigh, rightSum) = findMaxSubarray(nums, mid + 1, high)
    (crossLow, crossHigh, crossSum) = findMaxCrossingSubarray(nums, low, mid, high)
    if leftSum >= rightSum and leftSum >= crossSum:
        return (leftLow, leftHigh, leftSum)
    elif rightSum >= leftSum and rightSum >= crossSum:
        return (rightLow, rightHigh, rightSum)
    return (crossLow, crossHigh, crossSum)

if __name__ == "__main__":
    nums = [13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7]
    (low, high, sum) = findMaxSubarray(nums, 0, len(nums) - 1)
    print("low: {}, high: {}, sum: {}".format(low, high, sum))