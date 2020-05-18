/**
 * 152. 乘积最大子数组
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] dp_max = new int[len];
        int[] dp_min = new int[len];
        int ans = nums[0];
        dp_max[0] = nums[0];
        dp_min[0] = nums[0];
        for(int i=1;i<len;i++) {
            if (nums[i] >=0) {
                dp_max[i] = Math.max(dp_max[i-1] * nums[i],nums[i]);
                dp_min[i] = Math.min(dp_min[i-1] * nums[i],nums[i]);
            }else {
                dp_max[i] = Math.max(dp_min[i-1] * nums[i],nums[i]);
                dp_min[i] = Math.min(dp_max[i-1] * nums[i],nums[i]);
            }
            ans = Math.max(dp_max[i],ans);
        }
        return ans;

    }
    
}