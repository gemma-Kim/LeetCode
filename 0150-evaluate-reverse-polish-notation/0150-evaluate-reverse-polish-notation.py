class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        tokens_list = []
        result = 0
        for token in tokens:
            if token in ["+", "-", "*", "/"]:
                last, next_last = tokens_list.pop(-1), tokens_list.pop(-1)
            if token == "*":
                result = last * next_last
            elif token == "/":
                result = result = int(float(next_last) / last)
            elif token == "+":
                result = last + next_last
            elif token == "-":
                result = next_last - last
            else:
                result = int(token)
            tokens_list.append(result)
        return tokens_list[0];