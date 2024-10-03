class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        tw = {}
        tw_keys = []
        tw_values = []
        for i in range(len(s)):
            if s[i] not in tw_keys and t[i] not in tw_values:
                tw_keys.append(s[i])
                tw_values.append(t[i])
                tw[s[i]] = t[i]
            else:
                if s[i] in tw_keys and t[i] in tw_values:
                    if tw[s[i]] != t[i]:
                        return False
                else:
                    return False
        return True