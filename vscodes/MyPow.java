import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * 50. Pow(x, n)
 */
public class MyPow {
    public double myPow(double x, int n) {
        double a = 1.0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0)
                a *= x;
            x *= x;
        }
        return a;

    }

    public int getList() {
        List<BigDecimal> list = new ArrayList<>();
        BigDecimal sum = new BigDecimal(BigInteger.ZERO);
        BigDecimal a = new BigDecimal(BigInteger.ONE);
        for(int i=0;i<20;i++) {
            sum = sum.add(a);
            list.add(sum);
        }

        return 0;
    }

    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        // myPow.getList();
        // double d = myPow.myPow(2.00000, 10);
        System.out.println(4&2);
    }
}