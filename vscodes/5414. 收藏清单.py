class Solution(object):
    def peopleIndexes(self, favoriteCompanies):
        """
        :type favoriteCompanies: List[List[str]]
        :rtype: List[int]
        """
        fav_set = [set(l) for l in favoriteCompanies]
        ans = []
        for i,x in enumerate(fav_set):
            flag = 0
            for j, y in enumerate(fav_set):
                if i ==j:
                    continue
                if x&y == x:
                    flag = 1
                    break
            if flag == 0:
                ans.append(i)
                    
        return ans
            
       
            
        
favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
Solution().peopleIndexes(favoriteCompanies)