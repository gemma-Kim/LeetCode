class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        tw = {}
        for i in range(len(s)):
            if s[i] in tw.keys() and t[i] in tw.values():
                if tw[s[i]] != t[i]:
                    return False
            elif s[i] not in tw.keys() and t[i] not in tw.values():                
                tw[s[i]] = t[i]
            else:
                return False
        return True