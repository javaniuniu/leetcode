public class CanMeasureWater {
    private static CanMeasureWater canMeasureWater = new CanMeasureWater();
    public boolean canMeasureWater(int x, int y, int z) {
        if(z==0) { // 当z == 0 时 肯定满足
            return true;
        }
        if(x+y<z) { //这个条件 题目中没说清楚
            return false;
        }
        if (x==0) { // 当x=0时 z==y 才能满足条件
            return z==y;
        }
        // # 保证y>x
        if(x>y) {
            int c = x;
            x = y;
            y = c;
        }
        // 求最大公约数，官方叫法 欧几里得法(辗转相除法)
        while (y%x!=0) {
            int c = y;
            y = x;
            x = c%x;
        }
        return z%x==0;
    }
    public static void main(String[] args) {
        int x = 5, y = 3, z = 4;
        boolean res=  canMeasureWater.canMeasureWater(x, y, z);
        System.out.println(res);
    }
}