class Solution(object):
    def reverse(self, x):
        ans = 0
        flag = 1
        if x <0:
            x = -x;
            flag = -flag

        while x  != 0:
            cur = x % 10
            ans = ans*10 + cur
            x //= 10
        return ans*flag if -2**31 <ans*flag <2**31 else 0
nums = -100
print(Solution().reverse(nums))