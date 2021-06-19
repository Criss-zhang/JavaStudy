package chapter15;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FilesTest {
    public static void main(String[] args)throws Exception {
//        Files.copy(Paths.get("路径/chapter15/FilesTest.java") ,new FileOutputStream("FilesTest.txt"));
        System.out.println(Files.isHidden(Paths.get("路径/chapter15/FilesTest.java")));
//        final List<String> gbk = Files.readAllLines(Paths.get("路径/src/chapter15/FilesTest.java"), Charset.forName("gbk"));
//        System.out.println(gbk);
//        System.out.println(Files.size(Paths.get("路径/src/chapter15/FilesTest.java")));
        final ArrayList<String> list = new ArrayList<>();
        list.add("海上生明月");
        list.add("天涯共此时");
        Files.write(Paths.get("FilesTest.txt"), list,Charset.forName("GBK"));
        Files.list(Paths.get(".")).forEach(new Consumer<Path>() {
            @Override
            public void accept(Path path) {
                System.out.println(path);
            }
        });
        Files.lines(Paths.get("src/chapter15/FilesTest.java"),Charset.forName("UTF-8")).forEach((path)->System.out.println(path));
        final FileStore fileStore = Files.getFileStore(Paths.get("/"));
        System.out.println(fileStore.getTotalSpace());
        System.out.println(fileStore.getUsableSpace());

    }
}
