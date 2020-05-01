class Solution:
    # 动态规划
    def massage(self, nums):
        lenNums = len(nums)
        if nums == None or lenNums ==0:
            return 0
        opt = [0] * lenNums
        if lenNums == 1:
            return nums[0]
        if lenNums == 2:
            return max(nums[0],nums[1])
        opt[0] = nums[0]
        opt[1] = max(nums[0],nums[1])
        for i in range(2,lenNums):
            a = opt[i-2] + nums[i]
            b = opt[i-1]
            opt[i] = max(a,b)
        return opt[lenNums-1]
    

    # 递归
    def massages(self, nums):
        lenNums = len(nums)-1
        return self.opt(nums,lenNums)

    def opt(self,nums,lenNums):
        if lenNums == 0 :
            return nums[0]
        elif lenNums == 1 :
            return max(nums[0],nums[1])
        else:
            a = self.opt(nums,lenNums-2) + nums[lenNums] # 选择nums[i]
            b = self.opt(nums,lenNums-1) # 不选nums[i]
            return max(a,b)
nums = [1,2,3,1]
print(Solution().massages(nums))

    # def rec_opt(self,arr,i):
    #     # 找出口
    #     if i ==0:
    #         return arr[0]
    #     elif i==1:
    #         return max(arr[0],arr[1])
    #     else:
    #         a = self.rec_opt(arr,i-2) + arr[i] #选择arr[i]
    #         b = self.rec_opt(arr,i-1)# 不选arr[i]
    #         return max(a,b)
# nums = [1,2,3,1]
# print(Solution().rec_opt(nums,3))