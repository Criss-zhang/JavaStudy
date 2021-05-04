package chapter7;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println(random.nextGaussian());
        System.out.println(random.nextInt(2000));
    }
}
