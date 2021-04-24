package package02.interfacestudy;

public class PrintCommand implements Command {
    @Override
    public void process(int[] target) {
        for (int i:target
             ) {
            System.out.println(i);
        }
    }
}
