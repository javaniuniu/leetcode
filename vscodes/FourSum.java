import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 4) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > target) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            for (int j = i;j<len;j++){
                if (i==j) continue;
                // if(nums[j] > target) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
                if(j > i && nums[j] == nums[j-1]) continue; // 去重
                int L = j+1;
                int R = len-1;
                while(L < R){
                    int sum = nums[i] + nums[j] + nums[L] + nums[R];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[L],nums[R]));
                        while (L<R && nums[L] == nums[L+1]) L++; // 去重
                        while (L<R && nums[R] == nums[R-1]) R--; // 去重
                        L++;
                        R--;
                    }
                    else if (sum < target) L++;
                    else if (sum > target) R--;
                }
                
            }
            
        }        
        return ans;

    }
    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        fourSum.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
    }
}