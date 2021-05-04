package chapter7;

import java.util.Calendar;

public class CalendarTest02 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.setLenient(true);
        instance.set(Calendar.MONTH,13);
        System.out.println(instance.getTime());
    }
}
