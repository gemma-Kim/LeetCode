class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        symbols = { 
            "I": 1, 
            "V": 5, 
            "X": 10, 
            "L": 50, 
            "C": 100, 
            "D": 500, 
            "M": 1000
        }
        result = symbols[s[-1]]
        for i in range(len(s) - 2, -1, -1):
            before_s = s[i+1]
            current_s = s[i]
            if current_s == "I":
                if before_s == "V" or before_s == "X":
                    result -= symbols[current_s]
                else:
                    result += symbols[current_s]
            elif current_s == "X":
                if before_s == "L" or before_s == "C":
                    result -= symbols[current_s]
                else:
                    result += symbols[current_s]
            elif current_s == "C":
                if before_s == "D" or before_s == "M":
                    result -= symbols[current_s]
                else:
                    result += symbols[current_s]
            else:
                result += symbols[current_s]
        return result