class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # i = 0
        # while i< len(nums):
        #     if nums[i] == nums[i+1]:
        #         nums.remove(i+1)
        #     i += 1
        # return nums
        j = 0
        for i in range(1, len(nums)):
            if nums[i] != nums[j]:
                j += 1
                nums[j] = nums[i]
        return j+1
nums = [1,1,2]
Solution().removeDuplicates(nums)