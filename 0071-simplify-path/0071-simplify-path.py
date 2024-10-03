class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        result = []
        for word in path.split('/'):
            if word:
                if word == "..":
                    result = result[:-1]
                elif word == ".":
                    continue
                else:
                    result.append(word)
        result = '/'.join(result)
        return "/" + result
