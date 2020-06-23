

public class Hungry{
    private Hungry() {
        System.out.println(Thread.currentThread().getName());
    };

    private volatile static Hungry hungry;

    // 双重检扯锁模式
    public static Hungry getInstance() {
        if(hungry ==null) {
            synchronized(Hungry.class) {
                if(hungry ==null) {
                    hungry = new Hungry();
                }
            }
        }
        
        return hungry;
    }
    // 多线程并发
    public static void main(String[] args) {
        for(int i =0;i< 10;i++) {
            new Thread(()->{
                hungry.getInstance();
            }).start();
        }
    }

}
