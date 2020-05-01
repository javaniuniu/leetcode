import java.util.Map;
import java.util.stream.Collectors;

/**
 * 最长回文串
 */
public class LongestPalindrome {
    private static LongestPalindrome longestPalindrome = new LongestPalindrome();

    /**
     * 给出字符串，找出可排列的最长回文串长度
     * 
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        Map<Integer, Integer> count = s.chars().boxed().collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

        int ans = count.values().stream().mapToInt(i -> i - (i & 1)).sum();
        return ans < s.length() ? ans + 1 : ans;
    }

    /**
     * 指定字符串，找出最长回文串
     * 
     * @param s
     * @return
     */
    public String longestPalindrome5(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // 一个中心的情况 aba
            int len2 = expandAroundCenter(s, i, i + 1); // 两个中心的情况 abba
            int len = Math.max(len1, len2);
            if (len > end - start) { // 每次循环 判断最长的回文串首尾
                start = i - (len - 1) / 2; // 当一个中心的情况 start = i - len/2 当两个中心的情况 i 右边做了 i+1 操作 所以 len -1
                end = i + len / 2; // 这个还好理解
            }
        }
        return s.substring(start, end + 1);

    }

    // 中心扩展算法
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome.longestPalindrome5("abcba"));
    }

}