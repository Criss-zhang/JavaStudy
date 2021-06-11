package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        try( FileInputStream fileInputStream = new FileInputStream("地址");
        ){
            final byte[] bytes = new byte[400];
            int hasRead = 0;
            while ((hasRead = fileInputStream.read(bytes)) > 0){
                System.out.println(new String(bytes,0,hasRead));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
