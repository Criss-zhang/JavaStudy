package package02.interfacestudy;

public class InterfaceTest04 {
    public void test(UnknownName un){
        System.out.println(un.getName());
    }

    public static void main(String[] args) {
        InterfaceTest04 interfaceTest04 = new InterfaceTest04();
        interfaceTest04.test(new UnknownName() {
            @Override
            public String getName() {
                return "hello";
            }
        });
    }
}
interface UnknownName{
    String getName();
}