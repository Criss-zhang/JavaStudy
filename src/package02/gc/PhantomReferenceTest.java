package package02.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) {
        String str = new String("hello moto");
        ReferenceQueue rq = new ReferenceQueue();
        PhantomReference phantomReference = new PhantomReference(str, rq);
        str = null;
        System.out.println(phantomReference.get());
        System.gc();
        System.runFinalization();
        System.out.println(rq.poll() == phantomReference);
    }
}
