class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        le = len(nums)
        if nums is None:
            return 0
        if le == 1:
            return nums[0]
        res = nums[0]
        dp_max ,dp_min = [0] * le ,[0] * le
        dp_max[0] = nums[0]
        dp_min[0] = nums[0]
        for i in range(1,le):
            if nums[i] >= 0:
                dp_max[i] = max(dp_max[i-1] * nums[i],nums[i])
                dp_min[i] = min(dp_min[i-1] * nums[i],nums[i])
            else:
                dp_max[i] = max(dp_min[i-1] * nums[i],nums[i])
                dp_min[i] = min(dp_max[i-1] * nums[i],nums[i])
            res = max(dp_max[i],res)
        return res

nums = [2,3,-2,4]
Solution().maxProduct(nums)