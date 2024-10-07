class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s_list = split(s, " ")
        p_dic = {}
        if len(s_list) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in p_dic:
                print('_______________', i)
                if p_dic[pattern[i]] != s_list[i]:
                    return False
            elif s_list[i] in p_dic.values():
                if pattern[i] not in p_dic:
                    return False
            else:
                p_dic[pattern[i]] = s_list[i]
        return True
            