class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int result = 2;
        int[] copy = Arrays.copyOf(nums, nums.length);
        for (int i = 2; i < nums.length; i++) {
            if (copy[i] != copy[i-1]) {
                nums[result] = nums[i];
                result++;
            } else if (copy[i] == copy[i-1] && copy[i] != copy[i-2]) {
                nums[result] = nums[i];
                result++;
            } 
        }
        return result;
    }
}