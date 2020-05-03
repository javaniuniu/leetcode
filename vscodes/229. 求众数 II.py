class Solution(object):
    # 摩尔投票法思路
    def majorityElement(self, nums):
        res = [] # 返回数组
        majorityO = -1 # 候选人1
        majorityT = -1 # 候选人2
        countO = 0 # 候选人1 票数
        countT = 0 # 候选人2 票数
        for num in nums:
            if countO == 0 and num != majorityT:
                majorityO = num
                countO += 1
                continue
            elif countT == 0 and num != majorityO:
                majorityT = num
                countT += 1
                continue
            else:
                if majorityO == num:
                    countO += 1
                elif majorityT == num:
                    countT += 1
                else:
                    countO -= 1
                    countT -= 1
        counterO = 0
        counterT = 0
            
        if countO > 0:
            for num in nums:
                if num == majorityO:
                    counterO += 1
        if counterO > len(nums)//3:
            res.append(majorityO)
        if countT > 0:
            for num in nums:
                if num == majorityT:
                    counterT += 1
        if counterT > len(nums)//3:
            res.append(majorityT)
        
        return res
nums = [1,2,3]
print(Solution().majorityElement(nums))
            
                
                    
                
                