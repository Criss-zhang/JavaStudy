package chapter16;

public class SecondThread implements Runnable{
    private int i;
    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);
            if (i == 20){
                final SecondThread secondThread1 = new SecondThread();
                new Thread(secondThread1,"new thread 1").start();
                new Thread(secondThread1,"new thread 2").start();
            }
        }
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
