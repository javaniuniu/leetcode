import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    private static LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
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
    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = lengthOfLongestSubstring.lengthOfLongestSubstring(s);
        System.out.println(max);
    }
}