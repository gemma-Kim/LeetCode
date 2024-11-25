function twoSum(numbers: number[], target: number): number[] {
    let left = 0
    let right = numbers.length - 1
    for (let i = 0; i < numbers.length - 1; i++) {
        const sum = numbers[left] + numbers[right]
        if (sum === target) return [left+1,right+1]
        else if (sum < target) left++
        else right--
    }
};