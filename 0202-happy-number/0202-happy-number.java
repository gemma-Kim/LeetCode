class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        while (n != 1) {
            int sum = 0;
            int current = n;
            while (current > 0) {
                int digit = current % 10;
                sum += digit * digit;
                current /= 10;
            }
            if (set.contains(sum)) return false;
            n = sum;    
            set.add(sum);    
        }
        return true;
    }
}