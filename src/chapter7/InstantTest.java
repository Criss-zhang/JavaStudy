package chapter7;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = instant.plusSeconds(7200);
        System.out.println(instant1);
        Instant parse = Instant.parse("2021-2-2T12:12:12.000Z");
        System.out.println(parse);
    }
}
