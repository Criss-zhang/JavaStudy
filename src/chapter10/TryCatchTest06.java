package chapter10;

public class TryCatchTest06 {
    public static void exceptionF(int a) throws Exception{
        if (a >0){
            throw new Exception("number must below 0");
        }
    }
    public static void exceptionS(int a)  {
        if (a >0){
            throw new RuntimeException("number must below 0");
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            exceptionF(3);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
        exceptionS(3);
    }
}
