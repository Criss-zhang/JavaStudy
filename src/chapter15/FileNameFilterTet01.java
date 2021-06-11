package chapter15;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterTet01 {
    public static void main(String[] args) {
        final File file = new File(".");
        final String[] nameList = file.list(new FilenameFilter() {
            /**
             * Tests if a specified file should be included in a file list.
             *
             * @param dir  the directory in which the file was found.
             * @param name the name of the file.
             * @return {@code true} if and only if the name should be
             * included in the file list; {@code false} otherwise.
             */
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
                return name.endsWith(".java") || new File(name).isDirectory();
            }
        });
        for (String name : nameList)
        {
            System.out.println(name);
        }

    }
}
