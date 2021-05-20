package chapter10;

public class ThreadExceptionTest implements Runnable{
    public static void main(String[] args) {
        new Thread(new ThreadExceptionTest()).start();
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
        secondMehtod();
    }

    private void secondMehtod() {
        int a = 5;
        int b = 0;
        int c = a/b;
    }
}
