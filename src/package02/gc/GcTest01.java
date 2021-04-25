package package02.gc;

public class GcTest01 {
    public static void main(String[] args) {
        for (int i = 0 ;i <4;i++){
            new GcTest01();
            System.gc();
//            Runtime.getRuntime().gc();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾回收工作");
    }
}
