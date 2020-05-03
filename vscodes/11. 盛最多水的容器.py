class Solution(object):
    def maxArea(self, height):
        left_index = 0
        right_index = len(height)-1
        ans = 0
        while left_index != right_index:
            left_height = height[left_index]
            right_height = height[right_index]
            product = 0
            if left_height > right_height:
                product = (right_index - left_index) * right_height
                right_index -= 1
            else:
                product = (right_index - left_index) * left_height
                left_index += 1
            ans = max(ans,product)
        return ans
                
            
height = [1,8,6,2,5,4,8,3,7]
print(Solution().maxArea(height))