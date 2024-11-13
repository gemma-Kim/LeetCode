class Solution {
    public boolean isPalindrome(String s) {
        String ls = s.toLowerCase();
        String alphanumeric = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder ns = new StringBuilder();

        // Only keep alphanumeric characters
        for (int i = 0; i < ls.length(); i++) {
            if (alphanumeric.indexOf(ls.charAt(i)) != -1) {
                ns.append(ls.charAt(i));
            }
        }

        // Check if the cleaned string is a palindrome
        String cleaned = ns.toString();
        String reversed = ns.reverse().toString();
        return cleaned.equals(reversed);

    }
}