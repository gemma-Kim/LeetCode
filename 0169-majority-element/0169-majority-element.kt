class Solution {
    fun majorityElement(nums: IntArray): Int {
        val halfNumsSize = nums.size / 2 + 1
        val map = HashMap<Int, Int>();
        for (num in nums) {
            val newV = map.getOrDefault(num, 0) + 1
            if (newV >= halfNumsSize) return num
            map.put(num, newV)
        }
        return -1
    }
}