function majorityElement(nums: number[]): number {
    const sizee = nums.length / 2
    const map = new Map<number, number>()
    for (const num of nums) {
        const val = map.has(num) ? map.get(num) + 1 : 1
        if (val >= sizee) return num
        map.set(num, val)
    }
};