import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsValid {
    /**
     * 哈希表
     * 
     * @param s
     * @return
     */
    private static Map<Character, Character> map = new HashMap<>() {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        {
            put('[', ']');
            put('{', '}');
            put('(', ')');
            put('?', '?');
        }
    };

    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

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

    public boolean isVadis(String s) {
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
        boolean bool =  sIsValid.isVadis(str);
        System.out.println(bool);
    }
}