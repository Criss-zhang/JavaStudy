package chapter7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Type;

public class MethodHandleTest01 {
    public static void main(String[] args) throws Throwable {
        MethodType methodType = MethodType.methodType(void.class);
        MethodHandle hello = MethodHandles.lookup().findStatic(MethodHandleTest01.class, "hello", methodType);
        hello.invoke();
        MethodHandle hello1 = MethodHandles.lookup().findVirtual(MethodHandleTest01.class, "hello", MethodType.methodType(String.class, String.class));
        System.out.println(hello1.invoke(new MethodHandleTest01(),"criss"));

    }
    private static void hello(){
        System.out.println("hello");
    }
    private  String hello(String name){
        System.out.println(name +"    hello");
        return name+"hello";
    }
}
