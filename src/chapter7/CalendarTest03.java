package chapter7;

import java.util.Calendar;

public class CalendarTest03 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(2012,7,31);
        System.out.println(instance.getTime());
        instance.set(Calendar.MONTH,8);
//        System.out.println(instance.getTime());
        instance.set(Calendar.DATE,5);
        System.out.println(instance.getTime());

    }
}
