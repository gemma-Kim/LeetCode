class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        tokens_list = []
        for token in tokens:
            result = 0
            if token == "*":
                last, next_last = tokens_list.pop(-1), tokens_list.pop(-1)
                result = last * next_last
            elif token == "/":
                last, next_last = tokens_list.pop(-1), tokens_list.pop(-1)
                print('last', last)
                print('next_last', next_last)
                # if last 
                result = result = int(float(next_last) / last)  # 여기 수정
            elif token == "+":
                last, next_last = tokens_list.pop(-1), tokens_list.pop(-1)
                result = last + next_last
            elif token == "-":
                last, next_last = tokens_list.pop(-1), tokens_list.pop(-1)
                result = next_last - last
            else:
                result = int(token)
            tokens_list.append(result)
        return tokens_list[0];