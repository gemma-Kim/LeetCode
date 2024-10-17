class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        c_s = Counter(s)
        print(c_s)
        for a in t:
            print(a)
            if a in c_s:
                if c_s[a] > 0:
                    c_s[a] = c_s[a] - 1
                else:
                    return False
            else:
                return False

        return True if len(set(c_s.values())) == 1 and list(set(c_s.values()))[0] == 0 else False