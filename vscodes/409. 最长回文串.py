def longestPalindrome(s):
    di = {}
    max = 0
    for ch in s:
        if ch in di:
            di[ch] +=  1
        else:
            di[ch] = 1
    flag = 0
    for d in di:
        if di[d]%2==1:
            flag = 1
            max += di[d]- di[d]%2
        else:
            max += di[d]
    if flag ==1 or len(s)%2==1:
        max += 1
    else:
        return max
    
    return max
        
s = "ab"
print(longestPalindrome(s) )
