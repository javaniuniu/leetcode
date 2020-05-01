import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

/**
 * 面试题40. 最小的k个数
 */
public class LeastNumbers {
    private static LeastNumbers lNumbers = new LeastNumbers();
     /**
       * 快排思想
       * @param arr
       * @param k
       * @return
       */
      public int[] getLeastNumbers(int[] arr,int k) { 
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            for (int j=i;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        int[] res = new int[k];
        for (int i = 0;i<k;i++) {
            res[i] = arr[i];
        }
        return res;
  }
  /**
   * 小根堆
   * @param arr
   * @param k
   * @return
   */
  public int[] getLeastNumbersByStack(int[] arr,int k) { 
      // 默认是小根堆，实现大根堆需要重写一下比较器。
      Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
      for(int num :arr) {
        if(pq.size()<k)
            pq.offer(num);
        else if(pq.peek()>num) {
            pq.poll();
            pq.offer(num);
        }
      }
      // 返回堆中的元素
      int[] res = new int[pq.size()];
      int idx = 0;
      for(int num: pq) {
          res[idx++] = num;
      }
      return res;

  }
    /**
     * 二叉树
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbersByTree(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // TreeMap的key是数字, value是该数字的个数。
        // cnt表示当前map总共存了多少个数字。
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int cnt = 0;
        for (int num: arr) {
            // 1. 遍历数组，若当前map中的数字个数小于k，则map中当前数字对应个数+1
            if (cnt < k) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                cnt++;
                continue;
            } 
            // 2. 否则，取出map中最大的Key（即最大的数字), 判断当前数字与map中最大数字的大小关系：
            //    若当前数字比map中最大的数字还大，就直接忽略；
            //    若当前数字比map中最大的数字小，则将当前数字加入map中，并将map中的最大数字的个数-1。
            Map.Entry<Integer, Integer> entry = map.lastEntry();
            if (entry.getKey() > num) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (entry.getValue() == 1) {
                    map.pollLastEntry();
                } else {
                    map.put(entry.getKey(), entry.getValue() - 1);
                }
            }
            
        }

        // 最后返回map中的元素
        int[] res = new int[k];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int freq = entry.getValue();
            while (freq-- > 0) {
                res[idx++] = entry.getKey();
            }
        }
        return res;
    }


    public int[] getLeastNumbersByArray(int[] arr, int k) {
        return Arrays.stream(arr).sorted().limit(k).toArray();
    }


  public static void main(String[] args) {
    int[] arr = new int[]{4,4,5,2,1};
    int k = 3;
    System.out.println(Arrays.toString(lNumbers.getLeastNumbersByTree(arr, k)));
  }

}