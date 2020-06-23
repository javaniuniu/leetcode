class Solution(object):
    def xorOperation(self, n, start):
        curr_list = []
        curr1 = 3 ^ 5 ^ 7 ^ 9
        curr2 = 3 ^ 5 ^ 7
        curr3 = 3 ^ 5
        for i in range(n):
            curr_list.append(start + 2*i) 
        if n < 2:
            return curr_list[0] 
        curr_oxr = curr_list[0]
        j = 1
        while j < n:
            curr_oxr = curr_oxr ^ curr_list[j]

            j = j + 1
        return curr_oxr

Solution().xorOperation(4,3)