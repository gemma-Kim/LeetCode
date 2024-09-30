class Solution(object):
    def lengthOfLongestSubstring(self, s):
        maxLen = 0
        if not s:
            return maxLen
        current_s = s[0]
        for i in range(1, len(s)):
            if s[i] in current_s:
                for j in range(len(current_s)):
                    if s[i] == current_s[j]:
                        current_s = current_s[j+1:]
                        break;
            current_s += s[i]
            maxLen = max(len(current_s), maxLen)
        return maxLen if maxLen != 0 else len(s)
        