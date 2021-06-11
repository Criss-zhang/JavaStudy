package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        try(
                final FileInputStream fileInputStream = new FileInputStream("地址");
                final FileOutputStream fileOutputStream = new FileOutputStream("地址");
                ){
            final byte[] bytes = new byte[1024];
            int hasRead = 0;
            while ((hasRead = fileInputStream.read(bytes))>0){
                fileOutputStream.write(bytes,0,hasRead);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
