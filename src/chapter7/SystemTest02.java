package chapter7;

public class SystemTest02 {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
        //identityHashCode值将会准确计算hash，由内存地址来计算的
        System.out.println(System.identityHashCode(new SystemTest02()));
    }
}
