package package02.interfacestudy;

public class InterfaceTest02 {
    public static void main(String[] args) {
        Output printer = new Printer();
        printer.getData("ssss");
        printer.getData("cccc");
        printer.out();
        printer.getData("hello");
        printer.getData("world");
        printer.out();
        printer.print("猪八戒","孙悟空");
        printer.test();
        Product product = new Printer();
        System.out.println(product.getProduceTime());
        Object o = product;

    }
}
