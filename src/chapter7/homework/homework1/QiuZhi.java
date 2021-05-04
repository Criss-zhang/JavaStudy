package chapter7.homework.homework1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class QiuZhi {
    double[] arrays = new double[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QiuZhi qiuZhi = new QiuZhi();
        int pos = 0;
        while (pos<=9){
            System.out.println("请输入第"+(1+pos)+"个数字");
            String next = scanner.next();
            qiuZhi.arrays[pos]  = Double.parseDouble(next);
            System.out.println(Arrays.toString(qiuZhi.arrays));
            ++pos;
            System.out.println(pos);
            if (pos == 10)break;
        }
        BigDecimal avg = QiuZhi.avg(qiuZhi.arrays);
        System.out.println(avg);
        BigDecimal max = qiuZhi.max(qiuZhi.arrays);
        System.out.println(max);
    }
    public static BigDecimal add(double[] arrays){
        BigDecimal[] bd = new BigDecimal[arrays.length];

        for (int i = 0 ; i < arrays.length;i++){
            bd[i] = BigDecimal.valueOf(arrays[i]) ;
        }
        BigDecimal big = BigDecimal.valueOf(0);
        for (int i = 0 ; i < bd.length;i++){
            big =big.add(bd[i]);
        }
        return big;
    }
    public static BigDecimal avg(double[] arrays){
        BigDecimal add = QiuZhi.add(arrays);
        return add.divide(BigDecimal.valueOf(arrays.length));
    }

    public static BigDecimal max(double[] arrays){
        BigDecimal[] bd = new BigDecimal[arrays.length];
        for (int i = 0 ; i < arrays.length;i++){
            bd[i] = BigDecimal.valueOf(arrays[i]) ;
        }
        BigDecimal max = BigDecimal.valueOf(0);
        for (int i = 0 ; i < bd.length;i++){
            if (i ==0 ) {
                max = bd[0];
                continue;
            };
            if (bd[i].compareTo(bd[i-1])>=0 &&bd[i].compareTo(max)>=0){
                max = bd[i];
            }
        }
        return max;
    }
    public static BigDecimal min(double[] arrays){
        BigDecimal[] bd = new BigDecimal[arrays.length];
        for (int i = 0 ; i < arrays.length;i++){
            bd[i] = BigDecimal.valueOf(arrays[i]) ;
        }
        BigDecimal min = BigDecimal.valueOf(0);
        for (int i = 0 ; i < bd.length;i++){
            if (i ==0 ) {
                min = bd[0];
                continue;
            };
            if (bd[i].compareTo(bd[i-1])<=0 &&bd[i].compareTo(min)>=0){
                min = bd[i];
            }
        }
        return min;
    }
}
