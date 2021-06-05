package chapter14;

import java.lang.annotation.*;


@FkTag(name = "criss",age = 12)
@FkTag(name = "lll",age = 12)
public class AnnotationTest08 {
    public static void main(String[] args) {
        final Class<AnnotationTest08> annotationTest08Class = AnnotationTest08.class;
        final FkTag[] declaredAnnotationsByType = annotationTest08Class.getDeclaredAnnotationsByType(FkTag.class);
        for (FkTag f : declaredAnnotationsByType){
            System.out.println(f.name()+"---"+f.age());
        }
        final FkTags declaredAnnotation = annotationTest08Class.getDeclaredAnnotation(FkTags.class);
        System.out.println(declaredAnnotation);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(FkTags.class)
@interface FkTag{
String name() default "ccc";
int age();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface FkTags{
    FkTag[] value();
}