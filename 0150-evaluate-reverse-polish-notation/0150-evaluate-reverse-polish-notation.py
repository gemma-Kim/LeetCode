class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        tokens_list = []
        for token in tokens:
            if token in ["+", "-", "*", "/"]:
                last, next_last = tokens_list.pop(-1), tokens_list.pop(-1)
                if token == "*":
                    tokens_list.append(last * next_last)
                elif token == "/":
                    tokens_list.append(int(float(next_last) / last))
                elif token == "+":
                    tokens_list.append(last + next_last)
                elif token == "-":
                    tokens_list.append(next_last - last)
            else:
                tokens_list.append(int(token))
        return tokens_list[0];