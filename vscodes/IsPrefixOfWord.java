import java.util.List;

public class IsPrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] list = sentence.split(" ");
        for (int i=0;i<list.length;i++) {
            if (list[i].length()<searchWord.length())
                continue;
            if (list[i].substring(0,searchWord.length()).equals(searchWord))
                return i+1;

        }
        return -1;
    }
    public static void main(String[] args) {
        String s= "hello from the other side";
        String ss = "they";
        IsPrefixOfWord sd = new IsPrefixOfWord();
        sd.isPrefixOfWord(s, ss);
    }
}