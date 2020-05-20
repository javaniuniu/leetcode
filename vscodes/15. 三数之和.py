class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = []
        nums_len = len(nums)
        for i in range(nums_len):
            for j in range(nums_len):
                if i >= j:continue
                for k in range(nums_len):
                    if i >= k or j >= k: continue
                    if nums[i] + nums[j] + nums[k] == 0:
                        curr = [nums[i] , nums[j] , nums[k]]
                        ans.append(curr)
        return ans
nums = [-1, 0, 1, 2, -1, -4]
Solution().threeSum(nums)