package chapter14;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;


@NotNull
public class AnnotationTest09 implements Serializable {

    public static void main(@NotNull String[]args)throws FileNotFoundException {
        Object obj = "fkjava.org";

        String str = (@NotNull String)obj;

        Object win = new @NotNull JFrame("crisss");

    }
    public void foo(List<@NotNull String> info){}
}

@Target(ElementType.TYPE_USE)
@interface  NotNull{}