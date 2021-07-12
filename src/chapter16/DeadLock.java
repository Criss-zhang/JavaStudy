package chapter16;

public class DeadLock implements Runnable {
       A a =  new A();
       B b =  new B();
       public void init(){
           Thread.currentThread().setName("主线程");
           a.foo(b);
           System.out.println("进入主线程之后");
       }
    public static void main(String[] args) {
        final DeadLock deadLock = new DeadLock();
        new Thread(deadLock).start();
        deadLock.init();
    }
    @Override
    public void run() {
           //对DeadLock的这个线程起名"副线程"
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("进入副线程之后");
    }
}
class A {
    public synchronized void foo(B b){
        System.out.println("当前线程名"+Thread.currentThread().getName()+"进入了A实例方法");
        try {
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+"企图调用B实例的last方法");
        b.last();
    }
    public synchronized  void last(){
        System.out.println("进入了A类的last方法");
    }
}
class B{
    public synchronized void bar(A a){
        System.out.println("当前线程名"+Thread.currentThread().getName()+"进入了B实例方法");
        try {
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("当前线程名："+Thread.currentThread().getName()+"企图调用A实例的last方法");
        a.last();
    }
    public synchronized  void last(){
        System.out.println("进入了B类的last方法");
    }
}