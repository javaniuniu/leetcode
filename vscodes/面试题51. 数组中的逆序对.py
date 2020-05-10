class Solution(object):
    def reversePairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) < 2:
            return 0
        count = 0
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if nums[i]>nums[j]:
                    count += 1
        return count
nums = [7,5,6,4]
Solution().reversePairs(nums)
