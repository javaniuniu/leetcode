/**
 * 7. 整数反转
 */
public class Reverse {
    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            int curr = x % 10;
            ans = ans * 10 + curr;
            x /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ans;

    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int c = reverse.reverse(-100);
        System.out.println(-1%10);
    }

}