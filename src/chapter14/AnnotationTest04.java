package chapter14;

import java.lang.annotation.*;

public class AnnotationTest04 {
    public static void main(String[] args) {
        System.out.println(Expand.class.isAnnotationPresent(Inheritable.class));
    }
}
@Inherited
//@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)//必须得有这一项，否则将不会展示为true
@interface Inheritable{

}

@Inheritable
class Base{}

class Expand extends Base{}