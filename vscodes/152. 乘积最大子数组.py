class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        imax ,imin= 1,1
        ans = nums[0]
        for num in nums:
            if num < 0:
                imax ,imin = imin, imax
            imax = max(imax * num,num)
            imin = min(imin * num,num)
            ans = max(imax,ans)
        return ans

nums = [2,3,2,4]
Solution().maxProduct(nums)