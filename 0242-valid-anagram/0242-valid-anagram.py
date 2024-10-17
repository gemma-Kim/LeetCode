class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        c_s = Counter(s)
        for a in t:
            if a in c_s:
                if c_s[a] > 0:
                    c_s[a] = c_s[a] - 1
                    if c_s[a] == 0:
                        del c_s[a]
            else:
                return False
        return False if c_s else True