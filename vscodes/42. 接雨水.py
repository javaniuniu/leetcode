class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # 思路 求得每一层盛水量 即每一层中间 0 的个数
        hight_max = max(height)
        water = self.zero_count(height)
        for h in range(1,hight_max):
            for i in range(len(height)):
                if height[i]>0:
                    height[i] -= 1
                else:
                    height[i] = 0

            water += self.zero_count(height)
        return water
            
    def zero_count(self,arr):
        zero_max = arr.count(0) # 0出现的次数 包括 左右两边的 0
        left_index = 0
        right_index = len(arr) -1
        left_and_right_zero = 0 # 初始设置左边的 0 有 0个
        flag = True
        while flag:
            if arr[left_index] == 0:
                left_and_right_zero += 1
                left_index += 1
            elif arr[right_index] == 0:
                left_and_right_zero += 1
                right_index -= 1
            # elif arr[left_index] < 0 :
            #     left_index += 1
            # elif arr[right_index] < 0:
            #     right_index -= 1
            else:
                flag = False
            
        return zero_max - left_and_right_zero
height = [0,1,0,2,1,0,1,3,2,1,2,1]
print(Solution().trap(height))