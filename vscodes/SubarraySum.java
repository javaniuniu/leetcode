import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为K的子数组
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        // 计算前缀和数组
        int[] preSum = new int[len + 1];
        preSum[0] = 0;
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                // 区间和 [left..right]，注意下标偏移
                if (preSum[right + 1] - preSum[left] == k) {
                    count++;
                }
            }
        }
        return count;

    }

    public int subarraySum2(int[] nums, int k) {
        int count = 0;
        // key:前i个元素的和，value：对应key 出现的个数
        Map<Integer,Integer> preSumMap = new HashMap<>();
        // 数组下标为 0，则前面数组为空，所以和为 0，且出现一次  
        preSumMap.put(0, 1);
        int preSum = 0;
        for(int i = 0;i<nums.length;i++) {
            preSum += nums[i];
            if (preSumMap.containsKey(preSum-k)){
                count += preSumMap.get(preSum-k);
            }
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
        subarraySum.subarraySum2(new int[] { 1,2,1,2,1 }, 3);
    }
}