package chapter16;

public class DrawTest {
    public static void main(String[] args) {
         Account account = new Account("hello", 0);
         new DrawThread("取钱者", account,800).start();
         new DepositThread("存款者甲", account, 800).start();
         new DepositThread("存款者乙", account, 800).start();
         new DepositThread("存款者丙", account, 800).start();
    }
}
