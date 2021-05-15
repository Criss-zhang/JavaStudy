package chapter8;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer(6);
        priorityQueue.offer(-3);
        priorityQueue.offer(20);
        priorityQueue.offer(18);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        PriorityQueue ints = new PriorityQueue(new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                int o11 = (int)o1;
                int o22 = (int)o2;
                return o11> o22 ? -1 :
                        o11 < o22 ?1 :0;
            }
        });
        ints.offer(12);
        ints.offer(2);
        ints.offer(1);
        ints.offer(0);
        ints.offer(3);
        System.out.println(ints);
    }
}
