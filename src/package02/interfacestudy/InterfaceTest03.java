package package02.interfacestudy;

public class InterfaceTest03 {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] a = {1,2,3};
        processArray.process(a,new PrintCommand());
        processArray.process(a,new AddCommand());
    }
}
