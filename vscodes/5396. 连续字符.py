class Solution(object):
    def maxPower(self, s):
        s_max = 0
        curr_len = 0
        curr_sub = ''
        for ch in s:
            if ch == curr_sub:
                curr_len += 1
            else:
                curr_sub = ch
                curr_len = 0
            s_max = max(s_max,curr_len)
        return s_max + 1
Solution().maxPower("abbcccddddeeeeedcba")