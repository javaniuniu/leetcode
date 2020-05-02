import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {
    private static LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
    /**
     * 活动窗口 方法一
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> lookup = new HashSet<>();
        int cul_len = 0;
        int max_len = 0;
        for (int i=0;i<s.length();i++) {
            cul_len += 1;
            while (lookup.contains(s.charAt(i))) {
                lookup.remove(s.charAt(left));
                left += 1;
                cul_len -= 1;
            }

            if(cul_len>max_len)
                max_len = cul_len;
            lookup.add(s.charAt(i));
        }
        return max_len;
    }

    /**
     * 滑动窗口方法二
     * @param s
     * @return
     */
    public int lengthOfLongestSubstrings(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "pwwkew";
        int max = lengthOfLongestSubstring.lengthOfLongestSubstrings(s);
        System.out.println(max);
    }
}