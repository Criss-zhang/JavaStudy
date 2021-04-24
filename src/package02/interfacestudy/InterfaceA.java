package package02.interfacestudy;

public interface InterfaceA {
    int a = 0;
}
interface  InterfaceB{
    int b = 0;
}
interface InterfaceC extends InterfaceA,InterfaceB{
    int c = 0;
}