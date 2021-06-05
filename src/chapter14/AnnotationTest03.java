package chapter14;

import java.lang.annotation.*;

public class AnnotationTest03 {
    public static void main(String[] args)throws Exception {
//        final AnnotationTest03 annotationTest03 = new AnnotationTest03();
//        final Annotation[] tests = annotationTest03.getClass().getMethod("test").getAnnotations();
        Annotation[] annotations = Class.forName("chapter14.AnnotationTest03").getMethod("test").getAnnotations();
        for (Annotation a : annotations){
            System.out.println(a);
        }
    }
    @Testable//在提取javac的时候，将会提取该注解
    public void test(){
        System.out.println("info method");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@interface Testable{

}