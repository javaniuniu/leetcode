class Solution(object):
    def simplifiedFractions(self, n):
        if n<=1: return []
        def gcd(a,b):
            while b:
                a,b = b,a%b
            return a
        res = []
        for i in range(2,n+1):
            for j in range(1,i):
                if gcd(i,j)==1:
                    res.append(str(j)+'/'+str(i))
        return res
Solution().simplifiedFractions(4)