package chapter15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendContent {
    public static void main(String[] args) {
        try (
                final RandomAccessFile rw = new RandomAccessFile("out.txt", "rw");
                ){
            rw.seek(rw.length());
            rw.write("追加追加追加！！！".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
