package package02.interfacestudy;

public class StaticInnerClassTest {
    private int prop1 = 5;
    private static int prop2 = 9;
    static class InnerInnerClass{
        private static int age;
        public void test(){
//            System.out.println(prop1);不能访问，因为静态类不能访问非静态变量
            System.out.println(prop2);
        }
    }
}
