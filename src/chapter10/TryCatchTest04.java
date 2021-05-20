package chapter10;

import java.io.FileInputStream;

public class TryCatchTest04 {
    public static void main(String[] args) {
       System.out.println(ffff());
    }

    public static int  ffff(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("llalsfbafa.txt");
        }catch (Exception e){
            e.printStackTrace();
//            System.exit(1); //会直接关闭虚拟机
//            return 1;
        }finally {
            if (fis != null){
                try {
                    fis.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("执行了finally");
        }
        return  2;
    }
}
