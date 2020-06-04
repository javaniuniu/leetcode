class Solution(object):
    def removeElement(self, nums, val):
        for i in range(len(nums)-1,-1,-1):
            if nums[i] == val:
                nums.pop(i)
        return len(nums)
nums = [3,2,2,3]
val = 3
Solution().removeElement(nums,val)