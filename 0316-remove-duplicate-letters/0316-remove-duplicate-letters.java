class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26]; // 각 문자의 마지막 인덱스
        Stack<Character> stack = new Stack();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if (seen[idx]) continue;
            while (!stack.isEmpty() && ch < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            seen[idx] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}