class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals = sorted(intervals, key=lambda x: x[0])
        result = []
        for interval in intervals:
            if result:
                if result[-1][1] >= interval[0]:
                    start = result[-1][0]
                    end = interval[1] if result[-1][1] < interval[1] else result[-1][1]
                    result.pop()
                    result.append([start, end])
                else:
                    result.append(interval) 
            else:
                result.append(interval)
        return result