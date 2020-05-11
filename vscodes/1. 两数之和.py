class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = []
        nums_dict = {}
        for i, num in enumerate(nums):
            if target - num in nums_dict:
                res.append(nums_dict.get(target - num))
                res.append(i)
                return res
            nums_dict[num] = i
nums = [2, 7, 11, 15]
target = 9
Solution().twoSum(nums,target)
            