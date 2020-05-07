class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        flag_minus = False # 默认为正数
        # 保证 x 是正数 同时记录是否为负数
        if x < 0:
            x = -x
            flag_minus = True
        ans = 0
        while True:
            idx = x%10
            if x//10:
                ans = ans * 10 + idx
                x //=10
            else:
                res = flag_minus? -1 *(ans * 10 + idx) : ans * 10 + idx
                return ans * 10 + idx
nums = -100
print(Solution().reverse(nums))