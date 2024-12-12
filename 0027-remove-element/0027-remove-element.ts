function removeElement(nums: number[], val: number): number {
    let idx = 0
    for (let i = 0; i < nums.length; i++) {
        if (val != nums[i]) {
            nums[idx] = nums[i]
            idx++
        }
    }
    return idx
};