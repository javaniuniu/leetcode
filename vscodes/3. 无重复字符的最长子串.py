class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = 0
        len_max = 0
        sub_dict = {}
        sub_len = len(s)
        for i in range(len(s)):
            if s[i] in sub_dict:
                len_max = max(len_max,i-left)
                len_curr = sub_dict.get(s[i]) + 1 # 左指针 向有滑动 
                left = len_curr if len_curr > left else left  # 如果left小于当前滑动的值 则left不变，当出现 abba 时 
            sub_dict[s[i]] = i
        return max(len_max,sub_len-left)
s = 'abcabcbb'
print(Solution().lengthOfLongestSubstring(s))