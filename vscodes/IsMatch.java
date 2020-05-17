/**
 * TODO
 * 10. 正则表达式匹配
 */
public class IsMatch{
    public boolean isMatch(String s, String p) {
        char[] ch_s = s.toCharArray();
        char[] ch_p = p.toCharArray();
        int len_s = s.length();
        int len_p = p.length();
        int idx_s = 0;
        int idx_p = 0;
        char ch_m = ' '; // 用于 * 的匹配
        

        while (idx_p<=len_p && idx_s<len_s){

            
            if(ch_s[idx_s]==ch_m) { // 匹配零个或多个前面的那一个元素
                idx_s ++;
                continue;
            }else{
                // idx_p ++;
                ch_m = ' '; // 还原 不然会匹配后面的元素
            }
           
            if(ch_p[idx_p]=='*') { // TODO 匹配空的情况
                ch_m = ch_s[idx_s];
                idx_s ++;
                idx_p ++;
                continue;
            }

            if(ch_p[idx_p]=='.') {
                idx_s ++;
                idx_p ++;
                continue;
            }

            

            if(ch_p[idx_p] == ch_s[idx_s]){
                idx_s ++;
                idx_p ++;
            }else{
                return false;
            }
        }

       
        return idx_s == len_s && idx_p== len_p; //解决了很多问题 1. aa aa. 的情况

    }
    public static void main(String[] args) {
        IsMatch isMatch = new IsMatch();
        boolean b =  isMatch.isMatch("saa", "s*a");
        System.out.println(b);
    }
}