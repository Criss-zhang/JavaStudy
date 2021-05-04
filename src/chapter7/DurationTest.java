package chapter7;

import java.time.Clock;
import java.time.Duration;

public class DurationTest {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(6000);
        System.out.println(duration.toHours());
        System.out.println(duration.toDays());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMinutesPart());
    }
}
