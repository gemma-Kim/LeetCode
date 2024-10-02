class Solution(object):
    def isPalindrome(self, s):
        s = re.sub(r'[^a-zA-Z0-9]', '', s)
        s = s.lower()
        if not s:
            return True
        left = 0
        right = len(s) - 1
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True
        