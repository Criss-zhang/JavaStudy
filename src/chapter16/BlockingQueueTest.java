package chapter16;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) throws Exception{
        BlockingQueue bq = new ArrayBlockingQueue(1);
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        new Consumer(bq).start();

    }
}
class Producer extends Thread{
    private BlockingQueue bq;

    public Producer(BlockingQueue bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] str = {
                "hello",
                "who",
                "the",
        };
        for (int i = 0 ; i < 99999; i++){
            System.out.println(getName()+"准备生产工具");
            try {
                Thread.sleep(200);
                bq.put(str[i%str.length]);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"生产完成"+bq);
        }
    }
}

class Consumer extends Thread{
    private BlockingQueue bq;

    public Consumer(BlockingQueue bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true){
                System.out.println(getName()+"消费者");
                try {
                    Thread.sleep(200);
                    bq.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+"消费完成"+bq);
        }
    }
}