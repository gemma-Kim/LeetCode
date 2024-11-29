function maxArea(height: number[]): number {
    let maxA = 0
    let left = 0
    let right = height.length - 1
    while (left < right) {
        maxA = Math.max(maxA, (right-left) * Math.min(height[left], height[right]))
        if (height[left] < height[right]) left++
        else right--
    }
    return maxA
};