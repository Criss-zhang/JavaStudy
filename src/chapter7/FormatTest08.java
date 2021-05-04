package chapter7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTest08 {
    public static void main(String[] args) {
        String time1 = "2021-05月21日 15时23分23秒";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM月dd日 HH时mm分ss秒");
        LocalDateTime parse = LocalDateTime.parse(time1, dateTimeFormatter);
        System.out.println(parse);
    }
}
