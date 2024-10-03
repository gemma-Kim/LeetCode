class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        result = []
        path_list = path.split('/')
        for word in path_list:
            if word:
                if word == "..":
                    result = result[:-1]
                elif word == ".":
                    continue
                else:
                    result.append(word)
        # result = '/'.join(result)
        return "/" + '/'.join(result)
