package package02.homework2;

public class GameTest {
    public static void main(String[] args) {
        int[]a = {1,3,3,3,3,6};
        int[]b = {1,3,3,3,3,6};
        System.arraycopy(a,0,b,3,2);
        for (int s:b
             ) {
            System.out.println(s);
        }
    }
}
