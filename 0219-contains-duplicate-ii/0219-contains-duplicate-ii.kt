class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        for (i in 0..nums.size-1) {
            val preInx = map[nums[i]]
            if (preInx != null && i - preInx <= k) {
                return true
            }
            map[nums.get(i)] = i
        }
        return false
    }
}