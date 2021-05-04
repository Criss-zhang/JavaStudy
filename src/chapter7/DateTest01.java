package chapter7;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis() + 200);
        System.out.println(date);
        System.out.println(date1.after(date));
        System.out.println(date.compareTo(date1));
    }
}
