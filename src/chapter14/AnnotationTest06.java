package chapter14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationTest06 {
    public static void main(String[] args) throws Exception{
        ProcessorTest.process("chapter14.AnnotationTest06");
    }

    @Testable2
    public void m1(){}
    public void m2(){}

    @Testable2
    public static void m3(){
        throw new IllegalArgumentException("wrong arguement");
    }
    @Testable2
    public static void m4(){}
}



class ProcessorTest{
    public static void process(String clazz)throws Exception{
        int passed = 0;
        int failed = 0;
        for (Method m : Class.forName(clazz).getMethods()){
            if (m.isAnnotationPresent(Testable2.class)){
                try {
                    m.invoke(null);
                    passed++;
                }catch (Exception ex){
                    System.out.println("方法"+m+"运行失败"+ex.getCause());
                    failed++;
                }
            }
        }
        System.out.println("共运行了"+(passed+failed)+"个方法，失败"+failed+"成功"+passed);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Testable2{}