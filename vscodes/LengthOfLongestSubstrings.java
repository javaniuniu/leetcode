import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstrings {
    private static LengthOfLongestSubstrings leof = new LengthOfLongestSubstrings();

	public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int len = s.length();
        for(int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i ))) {
                max = Math.max(max,i - left);
                int cur = map.get(s.charAt(i))+1; // 
                left =  cur > left? cur :left; 
            }
            map.put(s.charAt(i),i);
        }
        return Math.max(max, len-left);
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = leof.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}