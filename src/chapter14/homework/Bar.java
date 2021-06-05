package chapter14.homework;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})
public @interface Bar {
    String name();
    double price();
}
