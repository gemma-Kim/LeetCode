function removeDuplicates(nums: number[]): number {
    let result = 2;
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] != nums[result-2]) {
            nums[result] = nums[i]
            result++
        }
    }
    return result
};