package chapter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest06 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("Gyyyy第D天");
        System.out.println(simpleDateFormat.format(date));
        String d = "23####2##21";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yy####M##d");
        System.out.println(simpleDateFormat1.parse(d));

    }
}
