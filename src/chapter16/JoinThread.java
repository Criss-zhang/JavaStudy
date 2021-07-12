package chapter16;

public class JoinThread extends Thread {
    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i< 100 ;i++){
            System.out.println(getName()+"  "+i);
        }
    }

    public static void main(String[] args) throws Exception{
        new JoinThread("新线程").start();
        for (int i = 0 ; i < 200;i++){
            if (i == 20){
                final JoinThread joinThread = new JoinThread("被join的线程");
                joinThread.start();
                joinThread.join();

            }
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
