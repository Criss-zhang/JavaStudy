package chapter15;

import java.io.*;
import java.io.*;

public class InsertContent {
    public static void main(String[] args) throws Exception{
        insertContent("路径",22,"哈喽啊");

    }
    public static void insertContent(String fileName,int pos,String content)throws IOException {
        final File tempFile = File.createTempFile("temp", null);
        tempFile.deleteOnExit();
        try (
                final RandomAccessFile rw = new RandomAccessFile(fileName, "rw");
                final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
                final FileInputStream fileInputStream = new FileInputStream(tempFile);
                ){
            rw.seek(pos);
            byte[] bytes = new byte[1024];
            int hasRead = 0;
            while ((hasRead = rw.read(bytes)) >0){
                fileOutputStream.write(bytes,0,hasRead);
            }
            rw.seek(pos);
            rw.write(content.getBytes());
            while ((hasRead = fileInputStream.read(bytes)) >0){
                rw.write(bytes,0,hasRead);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}