class Solution {
    fun isHappy(n: Int): Boolean {
        val set = HashSet<Int>();
        var number = n
        while (number != 1) {
            var sum = 0
            var current = number;
            while (current > 0) {
                val digit = current % 10
                sum += digit * digit
                current /= 10
            }
            if (set.contains(sum)) return false;
            set.add(sum)
            number = sum
        }
        return true;
    }
}