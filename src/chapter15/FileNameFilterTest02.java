package chapter15;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterTest02 {
    public static void main(String[] args) {
        final File criss = new File(".");
        System.out.println(criss.getAbsolutePath());
        final String[] txts = criss.list((dir, name) -> name.endsWith(".xml") || new File(name).isDirectory());
        for (String str : txts){
            System.out.println(str);
        }
    }
}
