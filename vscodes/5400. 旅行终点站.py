class Solution(object):
    def destCity(self, paths):
        ans = list(li[1] for li in paths)
        for p in paths:
            if p[0] in ans:
                ans.remove(p[0])
        return ans[0]

paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
print(Solution().destCity(paths))

