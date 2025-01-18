class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        int farthest = 0;
        for (int i = 0; i < nums.length-1; i++) {
            farthest = Math.max(farthest, nums[i]+i);
            if (farthest <= i) return false;
        }
        return true;
    }
}