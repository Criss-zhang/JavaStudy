package chapter15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        final Path path = Paths.get(".");
        System.out.println(path.getNameCount());
        System.out.println(path);
        System.out.println(path.getRoot());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toAbsolutePath().getRoot());
        System.out.println(path.toAbsolutePath().getNameCount());
        System.out.println(path.toAbsolutePath().getName(0));
        final Path path1 = Paths.get("g:", "publish", "codes");
        System.out.println(path1);

    }
}
