package package02.work;

public class PointTest {
    public  static int winPoint;
    public static void main(String[] args) {
        winPoint = 800;
//        System.out.println(winPoint);
        Player win1 = new Player(500);
        Player win2 = new Player(2000);
        Player lose1 = new Player(3000 );
        Player lose2 = new Player(100);
        PointTest.balance(win1,win2,lose1,lose2,winPoint);
        System.out.println(win1.getPoints());
        System.out.println(win2.getPoints());
        System.out.println(lose1.getPoints());
        System.out.println(lose2.getPoints());

    }
    public static void balance(Player win1,Player win2, Player lose1, Player lose2,int winPoint){
        //玩家1最多赢金
        int newWin1 = (win1.getPoints()>winPoint)? winPoint:win1.getPoints();
        System.out.println("newWin1:"+newWin1);
        //玩家2最多赢金
        int newWin2 = (win2.getPoints()>winPoint) ? winPoint:win2.getPoints();
        System.out.println("newWin2:"+newWin2);
        //队伍最高赢金
        int totalWin = newWin1+newWin2;
        System.out.println("totalWin:"+totalWin);
        //玩家1最多输分
        int newLose1 = (lose1.getPoints() > winPoint) ? winPoint :lose1.getPoints();
        //玩家2最多输分
        int newLose2 = (lose2.getPoints() > winPoint) ? winPoint :lose2.getPoints();
        //最高总输分
        int totalLose = newLose1 +newLose2;

        //当完全相等的时候
        if (totalLose == totalWin)
        {
            win1.setPoints(newWin1);
            win2.setPoints(newWin2);
            lose1.setPoints(-newLose1);
            lose2.setPoints(-newLose2);
        }else if (totalLose < totalWin){//当输方综合小于赢方总和
            lose1.setPoints(-newLose1);
            lose2.setPoints(-newLose2);
            if (totalLose/2 > newWin1){
                win1.setPoints(newWin1);
                win2.setPoints(totalLose - newWin1);
            }else if (totalLose/2 >= newWin2){
                win2.setPoints(newWin2);
                win1.setPoints(totalLose - newWin2);
            }else {
                win1.setPoints(totalLose/2);
                win2.setPoints(totalLose/2);
            }
        }else {//totalLose >= totalWin
            win1.setPoints(newWin1);
            win2.setPoints(newWin2);
            if (totalWin/2 > newLose1){
                lose1.setPoints(-newLose1);
                lose2.setPoints(-totalWin+newLose1);
            }else if (totalWin/2 >= newLose2){
                lose2.setPoints(newLose2);
                lose1.setPoints(-totalWin + newLose2);
            }else{
                lose1.setPoints(totalWin/2);
                lose2.setPoints(totalWin/2);
            }
        }


    }

}
