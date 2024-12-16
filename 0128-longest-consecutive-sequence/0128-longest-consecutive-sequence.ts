function longestConsecutive(nums: number[]): number {
    nums = nums.sort((a, b) => a - b); 
    if (!nums.length) return 0
    let current = 1;
    let max = 1;
    for (let i = 0; i < nums.length-1; i++) {
        if (nums[i] === nums[i+1]) continue;
        if (nums[i] + 1 === nums[i+1]) {
            current++;
            max = Math.max(current, max);
        } else {
            current = 1
        }
    }
    return max
};