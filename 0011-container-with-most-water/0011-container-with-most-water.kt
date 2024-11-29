class Solution {
    fun maxArea(height: IntArray): Int {
        var maxA = 0
        var left = 0
        var right = height.size - 1
        while (left < right) {
            maxA = Math.max(maxA, (right-left) * Math.min(height[left], height[right]))
            if (height[left] < height[right]) left++
            else right--
        }
        return maxA
    }
}