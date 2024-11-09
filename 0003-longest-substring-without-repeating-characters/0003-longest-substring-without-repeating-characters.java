class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // define two point
        int left = 0;
        int right = 1;
        int result = 1;
        while (left <= right && right < s.length()) {
            String sliced = s.substring(left, right);
            // without repeating characters
            char currentChar = s.charAt(right);
            if (sliced.indexOf(currentChar) == -1) {
                // update result to max value between size of sliced and current result
                result = Math.max(right-left+1, result);
                right++;
            } else {
                left++;
            }
        }

        return result;
    }
}