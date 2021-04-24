package package02.interfacestudy;

public class ATest {
    public static void main(String[] args) {
        int a = 0;
        A a1 = new A() {
            @Override
            public void test() {
                System.out.println(a);
            }
        };
        a1.test();
    }
}
interface A{
    void test();
}