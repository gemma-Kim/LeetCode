class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        str_x = str(x) if x >= 0 else str(-x)
        result_str = ""
        for idx in range(len(str_x)):
            if not result_str and not str_x[idx]:
                continue;
            result_str = str_x[idx] + result_str
        result_int = int(result_str) if x >= 0 else int(result_str) * -1
        if result_int < -2**31 or result_int > 2**31 - 1:
            return 0
        return result_int
        