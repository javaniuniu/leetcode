import java.util.Arrays;
/**
 * 16. 最接近的三数之和
 */
public class ThreeSumClosest{
    public int threeSumClosest(int[] nums, int target) {
        int nums_len = nums.length;
        Arrays.sort(nums);
        int ans_sum = nums[0] + nums[1] + nums[2];
        for(int i = 0 ;i<nums_len;i++) {
            int left = i + 1, right = nums_len - 1;
            while (left < right) {
                int curr_sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(curr_sum - target) < Math.abs(ans_sum - target) ) 
                    ans_sum = curr_sum;
                if (curr_sum > target) right --;
                else if (curr_sum < target) left ++;
                else return target;
            }
        }
        return ans_sum;
    }
}