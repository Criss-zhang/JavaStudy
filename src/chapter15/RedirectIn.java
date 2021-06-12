package chapter15;

import java.io.FileInputStream;
import java.util.Scanner;

public class RedirectIn {
    public static void main(String[] args) {
        try (
                final FileInputStream fileInputStream = new FileInputStream("/Users/zhanggang/Documents/GitHub/JavaStudy/src/chapter15/RedirectIn.java");
                ){
            System.setIn(fileInputStream);
            final Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                System.out.println("键盘输出内容是"+scanner.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
