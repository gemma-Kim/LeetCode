class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size-1
        for (i in 0 until numbers.size) {
            val sum = numbers[left] + numbers[right]
            if (sum == target) {
                return intArrayOf(left+1, right+1)
            } else if (sum < target) {
                left++
            } else {
                right--
            }
        }
        throw Exception()
    }
}