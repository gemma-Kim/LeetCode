class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        position = 0
        count = 0
        if len(nums) == 1:
            return count
        
        while position < len(nums):
            count += 1
            max_reach = position + nums[position]
            if max_reach >= len(nums) - 1:                
                break
            max_v = 0
            new_p = position
            for j in range(position + 1, position + nums[position] + 1):
                if j < len(nums):    
                    if max_v <= nums[j] + j:
                        max_v = nums[j] + j
                        new_p = j
            position = new_p
        return count
