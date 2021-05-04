package chapter7;

import java.util.Objects;

public class ObjectsTest {
    static String s = "ssss";
    public static void main(String[] args) {
        System.out.println(Objects.toString(s));
        System.out.println(Objects.hashCode(s));
        System.out.println(Objects.requireNonNull(s));
    }
}
