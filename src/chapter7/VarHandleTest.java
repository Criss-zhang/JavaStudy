package chapter7;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class VarHandleTest {
    static int MAX_AGE;
    String name;
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        VarHandle vh1 = MethodHandles.lookup().findVarHandle(VarHandleTest.class, "name", String.class);
        VarHandleTest varHandleTest = new VarHandleTest();
        System.out.println(vh1.get(varHandleTest));
        vh1.set(varHandleTest,"criss");
        System.out.println(varHandleTest.name);
        VarHandle max_age = MethodHandles.lookup().findStaticVarHandle(varHandleTest.getClass(), "MAX_AGE", int.class);
        max_age.set(12);
        System.out.println(varHandleTest.MAX_AGE);
    }
}
