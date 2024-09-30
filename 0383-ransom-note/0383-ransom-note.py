class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        m = {}
        alps = "abcdefghigklmnopqrstuvwxyz"
        print(alps)
        for i in range(len(magazine)):
            if magazine[i] in m:
                m[magazine[i]] = m[magazine[i]] + 1
            else:
                m[magazine[i]] = 1
        for i in range(len(ransomNote)):
            if ransomNote[i] in m:
                if m[ransomNote[i]] > 0:
                    m[ransomNote[i]] = m[ransomNote[i]] - 1
                else:
                    return False
            else:
                return False
        print(m)
        return True
        # for i in range(len(magazine)):
        #     if m[magazine[i]] :

        # for i in range(len(ransomNote)):
        #     if ransomNote[i]:
