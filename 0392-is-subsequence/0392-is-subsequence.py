class Solution(object):
    def isSubsequence(self, s, t):
        if not s:
            return True

        for w in t:
            if s[0] == w:
                s = s[1:]
            if not s:
                return True
        return False
        