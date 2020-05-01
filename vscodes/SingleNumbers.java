import java.util.Arrays;

/**
 * 只出现一次的数字
 */
public class SingleNumbers {
    private static SingleNumbers singleNumbers = new SingleNumbers();

    /**
     * 二分查询
     * @param numbs
     * @return
     */
    public int[] singleNumbers(int[] numbs) {
        int sum =0 ,min=Integer.MAX_VALUE, max = Integer.MIN_VALUE,zeroCount = 0;
        for (int num:numbs) {
            if (num==0)
                zeroCount += 1;
            min = Math.min(min,num);
            max = Math.max(max,num);
            sum ^= num;
        }
        // 需要特判一下某个数是0的情况。
        if (zeroCount == 1) 
            return new int[]{sum,0};
        int lo =min,hi = max;
        while (lo<=hi) {
            int mid = lo<0?lo+hi >>1 :lo+(hi-lo)>>1;
            int loSum =0,hiSum = 0;
            for (int num:numbs) {
                if (num<=mid)
                    loSum ^= num;
                else
                    hiSum ^= num;
            }

            if (loSum!=0&&hiSum!=0)
                // 两个都不为0，说明 p 和 q 分别落到2个数组里了。
                return new int[]{loSum,hiSum};

            if (loSum==0)
                // 说明 p 和 q 都比 mid 大，所以比 mid 小的数的异或和变为0了。
                lo =mid;
            else
                // 说明 p 和 q 都不超过 mid
                hi = mid;
            
        }
        // 其实如果输入是符合要求的，程序不会执行到这里，为了防止compile error加一下
        return null;
    }

    public static void main(String[] args) {
        int[] numbs = new int[]{4,1,4,6};
        System.out.println(Arrays.toString(singleNumbers.singleNumbers(numbs)));
    }

}