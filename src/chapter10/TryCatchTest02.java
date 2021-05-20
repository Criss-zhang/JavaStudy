package chapter10;

public class TryCatchTest02 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println(c);
        }catch (IndexOutOfBoundsException ie){
            ie.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
