package chapter7;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        Year now2 = Year.now();
        System.out.println(now2);
    }
}
