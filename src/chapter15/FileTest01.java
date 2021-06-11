package chapter15;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args)throws Exception {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());
        final File tempFile = File.createTempFile("aaa", ".txt", file);
        tempFile.deleteOnExit();
        final File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile是否存在"+newFile.exists());
        newFile.createNewFile();
        newFile.mkdirs();
        final String[] list = file.list();
        for (String fileName : list){
            System.out.println(fileName);
        }
        System.out.println("-===-=-=-=-=-=");
        final File[] files = File.listRoots();
        for (File root : files){
            System.out.println(root);
        }

    }
}
