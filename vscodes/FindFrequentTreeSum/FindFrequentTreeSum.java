package FindFrequentTreeSum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 508. 出现次数最多的子树元素和
 */
public class FindFrequentTreeSum {
    private int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null)
            return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        // 然后求出map中value最大值对应的Key
        List<Integer> res = new LinkedList<>();
        for (Integer i : map.keySet()) {
            if (map.get(i) == max)
                res.add(i);
        }
        // 转 数组
        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }

    public int helper(TreeNode root, Map<Integer, Integer> map) {
        if (root == null)
            return 0;
        // 求出当前节点为根的元素和
        int left = helper(root.left, map);
        int right = helper(root.right, map);
        int val = left + right + root.val;
        map.put(val, map.getOrDefault(val, 0) + 1);
        max = Math.max(max, map.get(val));
        return val;
    }

}