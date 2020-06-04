class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        # 滑动窗口
        ans = -1
        haystack_len = len(haystack)
        needle_len = len(needle)
        if needle_len == 0:
            return 0
        if needle_len > haystack_len:
            return ans
        for i in range(haystack_len - needle_len + 1):
            if haystack[i:i+needle_len] == needle:
                ans = i
                break
        return ans
haystack = "ppi"
needle = "pi"
Solution().strStr(haystack,needle)