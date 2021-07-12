package chapter16;

public class PriorityTest extends  Thread{
    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public PriorityTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i < 100 ;i++){
            System.out.println(getName()+"   "+i+"优先级"+getPriority());
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for (int i = 0 ; i< 100;i++){
            if (i == 10){
                 PriorityTest low = new PriorityTest("低级");
                 low.start();
                 System.out.println("创建之初的优先级"+low.getPriority());
                 low.setPriority(MIN_PRIORITY);
            }
            if (i == 20){
                final PriorityTest high = new PriorityTest("高级");
                high.start();
                System.out.println("创建之初的优先级"+high.getPriority());
                high.setPriority(MAX_PRIORITY);
            }
        }
    }
}
