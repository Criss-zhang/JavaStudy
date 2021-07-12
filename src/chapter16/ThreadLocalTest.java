package chapter16;

public class ThreadLocalTest {
    public static void main(String[] args) {
        final Account02 aa = new Account02("初始化账户");
        new MyTest("线程甲", aa).start();
        new MyTest("线程乙", aa).start();
    }
}

class MyTest extends Thread{
    public Account02 account02;

    public MyTest(String name, Account02 account02) {
        super(name);
        this.account02 = account02;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if (i == 6){
                account02.setThreadLocal(getName());
            }
            System.out.println(account02.getThreadLocal()+"的i值为"+i);
        }
    }
}

class Account02 {
    private ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public Account02(String name){
        this.threadLocal.set(name);
        System.out.println("----"+this.threadLocal.get());
    }

    public String getThreadLocal() {
        return threadLocal.get();
    }

    public void setThreadLocal(String name) {
        this.threadLocal.set(name);
    }
}
