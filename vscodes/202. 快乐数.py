
# 快乐数
# class Solution:
#     def isHappy(n: int) -> bool:
#         sumNum = 0;
#         while n!=0:
#             sumNum += (n%10)*(n%10)
#             # print(a)
#             n //= 10
#             if n == 0:
#                 if sumNum == 1 or sumNum==7:
#                     return True
#                 if sumNum<10:
#                     return False
#                 else :
#                     n = sumNum
#                     sumNum = 0
            
# print(Solution.isHappy(10))

class Solution:
    def isHappy( n: int) -> bool:
        def get_next(n):
            total_sum = 0
            while n >0 :
                n , digit = divmod(n,10)
                total_sum += digit ** 2
            return total_sum

        while n != 1:
            if  n==7:
                return True
            if n<10:
                return False
            else :
                get_next(n)
        return True
Solution.isHappy(152)