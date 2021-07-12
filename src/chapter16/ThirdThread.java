package chapter16;

import java.awt.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args) {
        final ThirdThread thirdThread = new ThirdThread();
        final FutureTask<Integer> integerFutureTask = new FutureTask<>(new Callable<Integer>() {
            int i = 0;

            @Override
            public Integer call() throws Exception {
                for (; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "  " + i);
                }
                return i;
            }
        });
        for (int i =0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + "  "+i);
            if (i == 20){
                new Thread(integerFutureTask,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值"+integerFutureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
