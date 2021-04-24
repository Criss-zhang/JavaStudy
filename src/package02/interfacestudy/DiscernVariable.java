package package02.interfacestudy;

public class DiscernVariable {
    private String prop = "外部类的prop";
    private class InClass{
        private String prop = "内部类的成员prop";
        public void info(){
            String prop = "info方法内的prop";
            System.out.println("info的prop："+prop);
            System.out.println("外部类的prop"+DiscernVariable.this.prop);
            System.out.println("内部类的实例变量的值"+this.prop);
        }
    }
    public void test(){
        InClass inClass = new InClass();
        inClass.info();
    }

    public static void main(String[] args) {
        DiscernVariable discernVariable = new DiscernVariable();
        discernVariable.test();
    }
}
