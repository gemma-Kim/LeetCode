class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int nSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nSum += i;
        }
        return nSum + nums.length - sum;
    }
}