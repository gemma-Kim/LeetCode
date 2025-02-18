class Solution {
    fun missingNumber(nums: IntArray): Int {
        var sum = 0;
        var sumN = 0;
        for (i in 0..nums.size-1) {
            sum += nums[i]
            sumN += i
        }
        return sumN + nums.size - sum;
    }
}