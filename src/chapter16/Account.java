package chapter16;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String accountNo;
    private double balance;
    private boolean flag = false;
    public Account(){
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public synchronized void draw(double drawAmount){
        try {
            if (!flag)wait();
            else {
                System.out.println(Thread.currentThread().getName()+"取钱："+drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额为："+balance);
                flag = false;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public synchronized void deposit(double depositAmount){
        try {
            if (flag)wait();
            else{
                System.out.println(Thread.currentThread().getName()+"存款："+depositAmount);
                balance += depositAmount;
                System.out.println("账户余额为："+balance);
                flag = true;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(account.balance, balance) != 0) return false;
        if (flag != account.flag) return false;
        return accountNo != null ? accountNo.equals(account.accountNo) : account.accountNo == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = accountNo != null ? accountNo.hashCode() : 0;
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (flag ? 1 : 0);
        return result;
    }
}
