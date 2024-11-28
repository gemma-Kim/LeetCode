class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        System.out.println(digits[0]);
        for (int i = digits.length-1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i-1] += 1;
                digits[i] -= 10;
            }
        }

        if (digits[0] >= 10) {
            digits[0] -= 10;
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            System.arraycopy(digits, 0, newArr, 1, digits.length);
            return newArr;
        }
        
        return digits;
    }
}