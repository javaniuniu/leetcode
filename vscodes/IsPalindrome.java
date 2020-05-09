/**
 * 9. 回文数
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String strNum = String.valueOf(x);
        for(int i = 0;i<=strNum.length()/2;i++) {
            int a = strNum.charAt(i);
            int b = strNum.charAt(strNum.length()-1-i);
            if(a != b) {
                return false;
            }
        }
        return true;

    }

    public boolean isPalindrome2(int x) {
        String reString = (new StringBuffer(x + "")).reverse().toString();
        return reString.equals(x+ "");

    }
    public static void main(String[] args) {
        int x = 1234321;
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome2(x)); 
        // StringBuffer string = new StringBuffer("123");
        // string.reverse();
        // System.out.println(string);
    }
}