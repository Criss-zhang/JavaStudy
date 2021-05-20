package chapter10;

public class TryCatchTest03 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println(c);
//        }catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
//            e.printStackTrace();
//        }
        }catch (Exception e){
            e = new RuntimeException("test");
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
