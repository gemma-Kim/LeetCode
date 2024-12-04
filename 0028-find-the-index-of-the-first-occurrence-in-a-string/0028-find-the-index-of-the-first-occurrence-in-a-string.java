class Solution {
    public int strStr(String haystack, String needle) {
        int result = haystack.indexOf(needle);
        // if (result == -1) return result;
        // for (int i = result; i < needle.length -1; i++) {
        //     if (haystack.length < i) {
        //         haystack.charAt(i) 
        //     } else {
        //         return -1;
        //     }
        // }
        return result;
    }
}