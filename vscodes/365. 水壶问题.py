# 365. 水壶问题
class Solution:
    def canMeasureWater(a: int, b: int, c: int) -> bool:
        if b>a:
            a , b = b ,a
        if b==0:
            return a==c
            
        while b!=0:
            temp = a % b
            a = b
            b = temp
        if c%a!=0:
            return False
        return True
        
print(Solution.canMeasureWater(0,0,0))