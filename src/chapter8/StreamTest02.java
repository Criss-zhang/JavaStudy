package chapter8;

import java.util.function.ToLongFunction;
import java.util.stream.IntStream;

public class StreamTest02 {
    public static void main(String[] args) {
        IntStream build = IntStream.builder().add(12).add(13).build();
        build.filter(ele -> ele==13).forEach(System.out::println);
        IntStream build2 = IntStream.builder().add(12).add(13).build();
        build2.mapToDouble(ele ->(double)ele ).forEach(System.out::println);
    }
}
