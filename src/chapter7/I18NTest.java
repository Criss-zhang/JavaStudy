package chapter7;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault(Locale.Category.DISPLAY);
        System.out.println(myLocale);
        ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
        System.out.println(bundle.getString("hello"));

    }
}
