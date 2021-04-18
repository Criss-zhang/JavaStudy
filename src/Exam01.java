public class Exam01 {


    public static void main(String[] args) {
//        Exam01.chengFa();
//        Exam01.tripleAngle(4);
//        Exam01.cycle(8);
    }



    public static void cycle(int r){
        for (int i = 0;i <= r*2 ;i+=2){
            int x = (int) Math.round(r-Math.sqrt(2*r*i - i*i));
            int len = 2*(r-x);
            for(int j = 0;j<= x;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0;k<=len ;k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void tripleAngle(int num){
        for (int i = 0;i <num;i++){
            for (int z = num*2-i;z>0;z--){
                System.out.print("-");
            }
            for (int j = 0 ;j <=(i*2);j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    //99乘法表
    public static void chengFa(){
        for (int i = 1 ;i<=9 ;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i+"x"+j+"="+(i*j)+"   ");
            }
            System.out.println("\n");
        }
    }
}
