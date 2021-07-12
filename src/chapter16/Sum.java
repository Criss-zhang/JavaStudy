package chapter16;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Sum {
    public static void main(String[] args) throws Exception{
        int[] ints = new int[100];
        Random random = new Random();
        int total = 0;
        for (int i = 0 ,len = ints.length;i<len;i++){
            ints[i] = random.nextInt(20);
            total += ints[i];
        }
        System.out.println(total);
        final ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        final ForkJoinTask<Integer> submit = forkJoinPool.submit(new CalTask(ints, 0, ints.length));
        System.out.println(submit.get());
        forkJoinPool.shutdown();
    }
}
class CalTask extends RecursiveTask<Integer>{
    private static final int THRESHOLD =20;
    private int[] arr;
    private int start;
    private int end;

    public CalTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (end-start < THRESHOLD){
            for (int i = start;i < end;i++){
                sum += arr[i];
            }
            return sum;
        }else{
            int middle = (end + start)/2;
            CalTask left = new CalTask(arr, start, middle);
            CalTask right = new CalTask(arr, middle, end);
            left.fork();
            right.fork();
            return left.join()+right.join();
        }
    }
}