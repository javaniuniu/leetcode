class Solution(object):
    def findRepeatNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i,v in enumerate(nums):            
            if v!=i:
                if nums[v]==v:
                    return v
                else:
                    nums[i],nums[v] = nums[v],nums[i]
        return -1
nums = [2, 3, 1, 0, 2, 5, 3]
print(Solution().findRepeatNumber(nums))