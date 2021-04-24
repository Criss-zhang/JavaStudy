package package02.interfacestudy;

public class AnonymousTest {
    public void test(Device d){
        System.out.println(d.getName());
        System.out.println(d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
        anonymousTest.test(new Device("蓝牙耳机") {
            @Override
            public double getPrice() {
                return 1314.52;
            }
        });
        Device d = new Device() {
            {
                System.out.println("重写的device的代码块");
            }
            @Override
            public double getPrice() {
                return 52.11;
            }

            @Override
            public String getName() {
                return "蓝牙键盘";
            }
        };
        anonymousTest.test(d);
    }
}
