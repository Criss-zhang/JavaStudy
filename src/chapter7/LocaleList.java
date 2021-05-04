package chapter7;

import java.util.Locale;

public class LocaleList {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0 ;i < availableLocales.length;i++){
            System.out.println(
                    availableLocales[i].getDisplayCountry()+"="+
                            availableLocales[i].getCountry()+"  "+
                            availableLocales[i].getDisplayLanguage()+"="+
                            availableLocales[i].getLanguage()
            );
        }
    }
}
