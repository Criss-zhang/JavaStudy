package chapter16;

public class ExHandler {
    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
        int i = 15/0;
        System.out.println("程序执行完毕");

    }
}
class MyExHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t+"线程出现了异常"+e);
    }
}