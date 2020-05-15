public class MyAtoi {
    public int myAtoi(String str) {
        str = str.trim(); // 收尾去空
        StringBuilder str_num = new StringBuilder("0");
        int flag = 1;

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 0; // 48 - 57
            if (i == 0 && num == 45) { // 判断正负
                flag = -flag;
            } else if (i == 0 && num == 43) {
                continue;
            } else if (num >= 48 && num <= 57) {
                str_num.append(str.charAt(i));
            } else {
                break;
            }
        }
        // 处理是否溢出
        double ans = Double.valueOf(str_num.toString()) * flag;
        if (ans > Double.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (ans < Double.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        MyAtoi myAtoi = new MyAtoi();
        char c = '+';

        System.out.println('+' - 1);
        System.out.println(myAtoi.myAtoi("2000000000000000000000000000000000000"));
    }

}