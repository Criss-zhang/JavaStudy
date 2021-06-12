package chapter15;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (
                final RandomAccessFile r = new RandomAccessFile("/Users/zhanggang/Documents/GitHub/JavaStudy/src/chapter15/RandomAccessFileTest.java", "r");
        ){
            System.out.println("当前指针位置"+r.getFilePointer());
            byte[] bytes = new byte[1024];
            r.seek(500);
            int hasRead = 0;
            while ((hasRead = r.read(bytes)) > 0){
                System.out.println(new String(bytes,0,hasRead));
                System.out.println("当前指针位置"+r.getFilePointer());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
