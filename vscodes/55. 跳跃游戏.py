class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        p = len(nums) -1
        falg = True
        while  p > 0 and falg:
            falg = False
            for i in range(p):
                if i + nums[i] >= p:
                    p = i
                    falg = True
                    break
                
        return falg
nums = []
Solution().canJump(nums)
                