package chapter7;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class TimeTest01 {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        Instant instant = clock.instant();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
        Clock offset = Clock.offset(Clock.systemUTC(), Duration.ofSeconds(7200));
        System.out.println(offset.instant());
    }
}
