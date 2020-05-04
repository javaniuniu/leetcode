class Solution(object):
    def isValid(self, s):
        # 初始化判断条件
        if s is None:
            return False
        if len(s) == 0:
            return True
        # 当左括号 则记录对于的右括号
        s_list = []
        for a in s:
            if a == '(':
                s_list.insert(0,')')
            elif a == '[':
                s_list.insert(0,']')
            elif a == '{':
                s_list.insert(0,'}')
            elif len(s_list) != 0 and a == s_list.pop(0): # len(s_list) != 0 出现 '[]]'清空的判断
                continue
            else: # 当 不匹配则 返回 False
                return False
        return True # 最后要清空 s_list 才是一个完整的闭环
        
s = '([)]'
print(Solution().isValid(s))