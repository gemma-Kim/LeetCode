class Solution(object):
    def isSubsequence(self, s, t):
        if not s:
            return True
        ss = s

        for w in t:
            if ss[0] == w:
                ss = ss[1:]
            if not ss:
                return True
        return False
        