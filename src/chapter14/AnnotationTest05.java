package chapter14;

import java.lang.annotation.*;

public class AnnotationTest05 {
    public static void main(String[] args) throws Exception{

        final AnnotationTest05 annotationTest05 = new AnnotationTest05();
         Annotation[] annotations = annotationTest05.getClass().getMethod("test").getAnnotations();
         for (Annotation a : annotations){
             if (a instanceof Anno01){
                 System.out.println(a);
                 System.out.println(((Anno01)a).name());
                 System.out.println(((Anno01)a).age());
             }
             System.out.println(a);
         }
    }
    @Anno01
    @Anno02
    public void test(){}
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Anno01{
    String name() default "criss";
    int age() default 32;
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Anno02{}