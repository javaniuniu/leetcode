import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IsValid {
    /**
     * 哈希表
     * 
     * @param s
     * @return
     */
    private static Map<Character, Character> map = new HashMap<>() {
        {
            put('[', ']');
            put('{', '}');
            put('(', ')');
            put('?', '?');
        }
    };

    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>() {
            {
                add('?');
            }
        };
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch))
                stack.add(ch);
            else if (map.get(stack.removeLast()) != ch)
                return false;
        }

        return stack.size() == 1;

    }

    public boolean isValids(String s) {
        while(s.contains("{}") || s.contains("[]") || s.contains("()") ){
            s.replace("{}", "");
            s.replace("[]", "");
            s.replace("()", "");
        }

        return s.length()== 0;
    }
    public static void main(String[] args) {
        String str = "()";
        IsValid sIsValid = new IsValid();
        boolean bool =  sIsValid.isValids(str);
        System.out.println(bool);
    }
}