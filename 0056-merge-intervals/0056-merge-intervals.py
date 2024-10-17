class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals = sorted(intervals, key=lambda x: x[0])
        # print(intervals)
        # print(intervals)
        result = []
        for interval in intervals:
            print('interval', interval)
            if result:
                if result[-1][1] >= interval[0]:
                    start = result[-1][0]
                    end = interval[1] if result[-1][1] < interval[1] else result[-1][1]
                    print(result)
                    result.pop()
                    print(result)
                    result.append([start, end])
                    print(result)
                else:
                    result.append(interval)   
            else:
                result.append(interval)
        return result