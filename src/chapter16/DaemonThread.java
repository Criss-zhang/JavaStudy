package chapter16;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 1000;i++){
            System.out.println(getName() + "  "+ i);
        }
    }

    public static void main(String[] args) {
        final DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        for (int i = 0 ; i < 100;i++){
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
