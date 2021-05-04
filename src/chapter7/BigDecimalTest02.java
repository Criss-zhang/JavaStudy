package chapter7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest02 {
    public static void main(String[] args) {
        System.out.println(BigDecimalTest02.divide(12.222, 13.1111));
    }
    private static int DEF_DIV_SCALE = 10;
    private BigDecimalTest02(){}
    public static double add(double val1,double val2){
        BigDecimal bd1 = BigDecimal.valueOf(val1);
        BigDecimal bd2 = BigDecimal.valueOf(val2);
        return bd1.add(bd2).doubleValue();
    }

    public static double sub(double val1, double val2){
        BigDecimal bd1 = BigDecimal.valueOf(val1);
        BigDecimal bd2 = BigDecimal.valueOf(val2);
        return bd1.subtract(bd2).doubleValue();
    }

    public static double mul(double val1 ,double val2 ){
        BigDecimal bd1 = BigDecimal.valueOf(val1);
        BigDecimal bd2 = BigDecimal.valueOf(val2);
        return bd1.multiply(bd2).doubleValue();
    }

    public static double divide(double val1,double val2){
        BigDecimal bd1 = BigDecimal.valueOf(val1);
        BigDecimal bd2 = BigDecimal.valueOf(val2);
        return bd1.divide(bd2,DEF_DIV_SCALE, RoundingMode.HALF_UP).doubleValue();
    }
}
