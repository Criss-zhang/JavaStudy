package package02.homework2;


import java.util.Random;

/**
 * 这是一个单例的类
 */
public class Game {
    //总牌池
    public static int[] card = new int[54];
    //余牌池
    public static int[] extraCard;

    public int cardPos = 0;
    //玩家数量

    private static Game instance;

    public static Player[] players = new Player[5];
    //定义发牌初始人
    public Position pos;

    //对外部隐藏了构造方法
    private Game(){}

    //只能通过该方法来创建实例
    public static Game newInstance(){
        if (instance ==null)return new Game();
        return instance;
    }

    //静态代码块用于初始化牌池
    {
        //用于初始化牌池
        for (int i = 0 ; i <54;i++){
            int num = new Random().nextInt(13);
            card[i] = num;
        }
        for (int a:card
        ) {
            System.out.print(a+",");
        }
    }


    //把玩家放入游戏中
    public void setPlayers(Player[] players,Position pos){
        if (players.length != 5){System.out.println("玩家数量不对"); return ;}
        for (int i = 0 ;i <5 ;i++){
            this.players[i] = players[i];
        }
        startPlayer(pos);
    }

    //设定从哪个玩家开始发牌
    public static void startPlayer(Position pos){
        //新创建一个player数组
        Player[] p = new Player[5];
        for (int i = 0;i <5 ;i++){
            //获取到初始的位置
            if (players[i].getPos() == pos){
                p[0] = players[i];
                //按照顺序重新排列
                for (int a = 0;a<players.length;a++){
                    int temp ;
                    //获取每个位置与初值的差量，并存储起来
                    temp = p[0].getPos().compareTo(players[a].getPos());
                    if (temp >0){
                        p[players.length-temp] = players[a];
                    }else{
                        p[Math.abs(temp)] = players[a];
                    }
                }
            }
        }
        //player数组指向排好序的
        players = p;
    }

    //发牌的方法
    public void init(){
        int a = 0;
        for (int i = 0 ; i< players.length;i++){
            int[] temp = new int[5];
            //如果玩家不进行游戏的话就不给发牌
            if (!players[i].isGaming())continue;
            System.arraycopy(card, a, temp, 0,5);
            players[i].setHandCard(temp);
            a+=5;
        }
//        给余牌分配空间
        extraCard = new int[card.length-a];
        //给余牌分配
        System.arraycopy(card,a, extraCard, 0,card.length-a);
    }


}
