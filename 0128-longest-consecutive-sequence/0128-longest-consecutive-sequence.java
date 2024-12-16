class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int current = 1;
        int max = current;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i] - 1) {
                current++;
                max = Math.max(current, max);
            } else if (nums[i-1] == nums[i]) {
            } else {
                max = Math.max(current, max);
                current = 1;
            }
        }
        return max;
    }
}