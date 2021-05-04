package chapter7;

import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random1 = new Random(50);
        Random random2 = new Random(50);
        System.out.println(random1.nextInt(2000));
        System.out.println(random1.nextGaussian());
        System.out.println(random2.nextInt(2000));
        System.out.println(random2.nextGaussian());
        Random random = new Random(System.nanoTime());


    }
}
