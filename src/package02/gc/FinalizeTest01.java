package package02.gc;

public class FinalizeTest01 {
    private static  FinalizeTest01 ft = null;
    public void info(){
        System.out.println("测试gc方法");
    }

    public static void main(String[] args) {
        new FinalizeTest01();
        System.gc();
        System.runFinalization();
        ft.info();
    }
    @Override
    protected void finalize() throws Throwable {
        ft = this;
    }
}
