class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [1] * len(nums)
        k = 1
        for i in range(len(nums)-1,-1,-1):# 倒序
            k *= nums[i]
            res[i] = k
            
        k = 1
        for i in range(len(nums)-1):
            res[i] = res[i+1] * k
            k *= nums[i]
        res[-1] = k
        return res
nums = [1,2,3,4]        
Solution().productExceptSelf(nums)