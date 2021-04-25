package package02.gc;

import java.lang.ref.WeakReference;

public class ReferenceTest {
    public static void main(String[] args) {
        String str = new String("java 学习！！");
        WeakReference weakReference = new WeakReference(str);
        str = null;
        System.out.println(weakReference.get());
        System.gc();
        System.runFinalization();
        System.out.println(weakReference.get());
    }
}
