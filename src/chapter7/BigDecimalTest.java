package chapter7;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01);
        BigDecimal bd1 = new BigDecimal("12.22222");
        BigDecimal bd11 = new BigDecimal("12.22322");
        BigDecimal bd2 = BigDecimal.valueOf(11.11111);
        BigDecimal bd3 = new BigDecimal(10.000001);
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.divide(bd11));



    }
}
