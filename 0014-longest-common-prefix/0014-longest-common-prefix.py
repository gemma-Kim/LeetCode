class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        sorted_strs = sorted(strs, key=len)
        result = sorted_strs[0]
        for word in sorted_strs[1:]:
            if not result:
                break
            if result == word:
                continue
            
            while result and word and result != word:
                if len(result) >= len(word):
                    result = result[:-1]
                else:
                    word = word[:len(result)]
        return result
