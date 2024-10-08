class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        while len(nums) < k:
            k -= len(nums)        
        k = len(nums) - k
        nums[:] = nums[k:] + nums[:k]
        