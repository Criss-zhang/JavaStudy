package chapter15;

import java.io.FileWriter;

public class FileWriteTest01 {
    public static void main(String[] args) {
        try(
                final FileWriter fileWriter = new FileWriter("路径");
                ){
            fileWriter.write("金色无端五十线，一弦一柱思华年");
            fileWriter.write("庄生晓梦迷蝴蝶，望帝春心托杜鹃");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
