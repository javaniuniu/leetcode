class Solution(object):
    def pivotIndex(self, nums):
        if len(nums) ==1:
            return 0
        total = sum(nums)
        curr_total = 0
        for i in range(len(nums)-1):
            curr_total += nums[i]
            if 2 * curr_total + nums[i+1] == total:
                return i+1
        return -1
nums = [-1,-1,-1,0,1,1]       
print(Solution().pivotIndex(nums))