package chapter8;


import javax.management.ValueExp;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        IntStream build = IntStream.builder()
                .add(12)
                .add(51)
                .add(31)
                .build();
//        System.out.println("max "+build.max());
//        System.out.println("min "+build.min().getAsInt());
//        System.out.println("sum"+build.sum());
//        System.out.println("count"+build.count());
//        System.out.println("average"+build.average());
//        System.out.println(build.allMatch(new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                if (value >10)return true;
//                return false;
//            }
//        }));
        IntStream intStream = build.map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return 1+operand;
            }
        });
        intStream.forEach(System.out::println);
    }
}
