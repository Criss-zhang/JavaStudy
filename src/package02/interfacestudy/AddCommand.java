package package02.interfacestudy;

public class AddCommand implements Command {

    @Override
    public void process(int[] target) {
        int count = 0;
        for (int i:target
             ) {
            count += i;
        }
        System.out.println(count);
    }
}
