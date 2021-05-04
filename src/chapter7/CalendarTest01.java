package chapter7;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date time = calendar.getTime();
        System.out.println(time);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(time);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE),
                calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
        calendar.add(Calendar.YEAR,1);
        System.out.println(calendar);
    }
}
