
class Solution:
    def createTargetArray(numbs, index):
        res = []
        for i in numbs:
            res.insert(index[i],numbs[i])
        print(res)
        return res

numbs = [1,2,3,4,0]
index = [0,1,2,3,0]
Solution.createTargetArray(numbs,index)