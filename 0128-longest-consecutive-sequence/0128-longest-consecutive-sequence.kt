class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size == 0) return 0
        Arrays.sort(nums);
        var max = 1;
        var current = 1;
        for (i in 0 until nums.size-1) {
            if (nums[i] == nums[i+1]) continue;
            if (nums[i]+1 == nums[i+1]) current++;
            else current = 1;
            max = Math.max(current, max)
        }
        return max;
    }
}