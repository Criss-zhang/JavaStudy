package chapter16;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

public class ForkJoinPoolTest {
    public static void main(String[] args) throws Exception{
        final ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new printTask(0,300));
        forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);
        forkJoinPool.shutdown();
    }
}
class printTask extends RecursiveAction{
    private static final int THRESHOLD = 50;
    private int start;
    private int end ;

    public printTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <THRESHOLD){
            for (int i = start ;i < end ; i ++){
                System.out.println(Thread.currentThread().getName()+"的i的值"+i);
            }
        }else {
        int middle = (start + end)/2;
            final printTask left = new printTask(start, middle);
            final printTask right = new printTask(middle, end);
            left.fork();
            right.fork();
        }
    }
}