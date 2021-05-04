package chapter7;


import java.text.NumberFormat;
import java.util.Locale;

public class FormatTest {
    public static void main(String[] args) throws Exception {
        double db = 2340000.56;
        Locale[] country = {Locale.CHINA,Locale.CANADA,Locale.US,Locale.JAPAN};
        NumberFormat[] nf = new NumberFormat[12];
        for (int i = 0;i < country.length;i++){
            nf[i*3] = NumberFormat.getNumberInstance(country[i]);
            nf[i*3 +1] = NumberFormat.getPercentInstance(country[i]);
            nf[i*3 +2] = NumberFormat.getCurrencyInstance(country[i]);
        }

        for (int i = 0; i < country.length;i++) {
            String tip =
                    i == 0 ? "----中国格式----" :
                            i == 1 ? "----加拿大格式----" :
                                    i == 2 ? "----美国格式----" : "----日本格式----";
            System.out.println(tip);
            System.out.println("通用格式"
                    + nf[i * 3].format(db));
            System.out.println("百分比格式" +
                    nf[i * 3 + 1].format(db));
            System.out.println("货币格式" +
                    nf[i * 3 + 2].format(db));
        }
    }

}
