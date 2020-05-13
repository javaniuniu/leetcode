import java.util.HashMap;
import java.util.Map;
/**
 * 136. 只出现一次的数字
 */
public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer i : nums) {
                Integer count = map.get(i);
                count = count == null ? 1 : ++count;
                map.put(i, count);
            }
            for (Integer i : map.keySet()) {
                Integer count = map.get(i);
                if (count == 1) {
                    return i;
                }
            }
            return -1; // can't find it.
        }
    }
}