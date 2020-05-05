class Solution(object):
    def longestSubarray(self, nums, limit):
        """
        :type nums: List[int]
        :type limit: int
        :rtype: int
        """
        # num_max = max(nums) # 找出最大值
        # num_basic = num_max - limit # 大于 num_basic 才能有被选择的权利
        if not nums:
            return 0
        curr_max = nums[0] # 当子数组下最大值 这里初始化为第一个数
        curr_min = nums[0] # 当子数组下最大值 这里初始化为第一个数
        sub_nums = [] # 以数组作为窗口滑动
        for num in nums:
            if abs(num - curr_max) <=  limit and abs(num - curr_min) <=  limit and abs(curr_max - curr_min) <= limit:
                curr_max = max(num,curr_max)
                curr_min = min(num,curr_min)
                sub_nums.append(num)
            else:    
                sub_nums.append(num)
                sub_nums.pop(0)
                
                curr_max = max(sub_nums) # 当子数组最大值
                curr_min = min(sub_nums) # 当前子数组最小值
        return  len(sub_nums)# 当数组中所有数都满足条件 则len_max,len_curr 进行比较
nums = [4,2,2,2,4,4,2,2]
k = 0
Solution().longestSubarray(nums,k)