package package02.interfacestudy;

public class LocalInnerClass {
    public static void main(String[] args) {
        class Base {
            int a = 0;
        }
        class BaseExtend extends  Base{
            int b = 0;
        }
        BaseExtend baseExtend = new BaseExtend();
        baseExtend.a = 12;
        baseExtend.b = 21;
        System.out.println(baseExtend.a);
        System.out.println(baseExtend.b);
    }
}
