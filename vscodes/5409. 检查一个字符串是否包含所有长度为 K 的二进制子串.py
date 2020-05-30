class Solution(object):
    def hasAllCodes(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: bool
        """
        s_len = len(s)
        if s_len < 2** k:
            return False
        curr = set()
        for i in range(s_len-k+1):
            curr.add(s[i:k+i])
        if len(curr) >= 2 ** k:
            return True
        else:
            return False
s= "00000000001011100"
k= 3

Solution().hasAllCodes(s,k)
