class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = ""
        closes = [')', ']', '}']
        opens = ['(', '[', '{']
        for ss in s:
            if not stack:
                stack += ss
            else:
                if (ss == closes[0] and stack[-1] == opens[0]) or (ss == closes[1] and stack[-1] == opens[1]) or (ss == closes[2] and stack[-1] == opens[2]):
                    stack = stack[:-1]
                else:
                    stack += ss
        print(stack)
        return True if not stack else False