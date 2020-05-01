class Solution:
    def longestPalindrome(self, s: str) -> str:
        start, end = 0, 0

        for i in range(len(s) - 1):
            lenOne = self.expandAroundCenter(s, i, i)
            lenTwo = self.expandAroundCenter(s, i, i+1)
            lenMax = max(lenOne, lenTwo)
            if lenMax > (end - start):
                start = i - (lenMax-1)//2
                end = i + lenMax//2
        return s[start:end+1]

    def expandAroundCenter(self, s: str, left: int, right: int) -> int:
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left = left - 1
            right = right + 1
        return right - left - 1

if __name__ == "__main__":
    st = 'abcba'
    solution = Solution() # 有括号和没有括号的区别
    res = solution.longestPalindrome(st)
    print(res)
