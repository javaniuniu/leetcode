import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 151. 翻转字符串里的单词
 */
public class ReverseWords {
    public String reverseWord(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);

    }

    public String reverseWords(String s) {
        // 收尾去空
        s = s.trim();
        int right = s.length() - 1;
        int left = right;
        StringBuilder res = new StringBuilder();
        while (left >= 0){
            while(left>=0 && s.charAt(left) !=' ')  left--;
            res.append(s.substring(left+1, right+1)+ " ");
            while (left >=0 && s.charAt(left) == ' ') left --;
            right = left;

        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords rWords = new ReverseWords();
        String str = "  hello world!  ";
        String d = rWords.reverseWords(str);
        System.out.println(d);
    }
}