class Solution(object):
    def numberOfSubarrays(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        nums_flag = 0
        for i in range(len(nums)):
            if  nums[i]%2 != 0:
                nums_flag += 1
            else:
                nums_flag = 0
            if nums_flag >=k:
                count += 1;
        return count
nums = [1,1,3,3,4]
k = 3
Solution().numberOfSubarrays(nums,k)
                
            