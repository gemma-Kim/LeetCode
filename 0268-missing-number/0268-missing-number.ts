function missingNumber(nums: number[]): number {
    let sum = 0, sumN = 0;
    for (let i = 0; i < nums.length; i++) {
        sum += nums[i]
        sumN += i
    }
    return sumN + nums.length - sum;
}; 