class Solution(object):
    def maxDiff(self, num):
        num_max = num
        num_min = num
        num_str = str(num)
        num_str.startswith('0')
        if num<10:
            return 8
        for n in num_str:
            if n == '9':
                continue
            else:
                num_str = num_str.replace(n,'9')
                num_max = int(num_str)
                break
        num_str_min = str(num)
        for i in range(len(num_str_min)):
            if i == 0 and  num_str_min[0] == '1':
                continue
            elif num_str_min[i] == '0':
                continue
            elif num_str_min[i] == num_str_min[0] :
                num_str_min = num_str_min.replace(num_str_min[i],'1')
                num_min = int(num_str_min)
                break
            else:
                num_str_min = num_str_min.replace(num_str_min[i],'0')
                num_min = int(num_str_min)
                break
        return num_max - num_min
s=1101057
print(Solution().maxDiff(s))