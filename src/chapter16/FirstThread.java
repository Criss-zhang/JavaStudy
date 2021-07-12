package chapter16;

public class FirstThread extends Thread {
    private int i ;

    @Override
    public void run() {
        for(;i<100;i++){
            System.out.println(this.getName()+"  "+i);
        }
    }

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);
            if (i == 20){
                firstThread.start();
            }
            if (i == 50){
                firstThread.stop();
            }
        }
    }
}
