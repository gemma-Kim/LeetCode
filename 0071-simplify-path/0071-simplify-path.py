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
        print(result)
        print('/'.join(result))
        result = '/'.join(result)
        # if result:
        #     if result[-1] == '.':
        #         return "/" + result[:-2]
        return "/" + result
