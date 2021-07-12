package chapter16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
         ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 100 ; i++){
                    System.out.println(Thread.currentThread().getName() + "i的值为"+i);
                }
            }
        };
        executorService.submit(r);
        executorService.submit(r);
        executorService.submit(r);
        executorService.submit(r);
        executorService.shutdown();
    }
}