class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        left = 0
        right = left + k
        current = sum(nums[left:right])
        max_sum = current
        while right < len(nums):
            current = current - nums[left] + nums[right]
            max_sum = max(max_sum, current)
            left += 1
            right += 1

        return max_sum / float(k)