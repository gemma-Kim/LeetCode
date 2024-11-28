class Solution {
    fun plusOne(digits: IntArray): IntArray {
        digits.set(digits.size-1, digits.get(digits.size-1)+1);
        for(i in digits.size-1 downTo 1) {
            if (digits.get(i) == 10) {
                digits.set(i, 0)
                digits.set(i-1, digits.get(i-1) + 1)
            }
        }

        if (digits.get(0) == 10) {
            digits.set(0, 0);
            return intArrayOf(1) + digits;
        }
        return digits
    }
}