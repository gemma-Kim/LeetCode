class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var result = 2;
        for (i in 2 until nums.size) {
            if (nums[i] != nums[result-2]) {
                nums[result] = nums[i]
                result++
            }
        }
        return result
    }
}