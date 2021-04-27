package package02.homework2;

import java.util.Arrays;

public class Player {
    //玩家的位置，绑定玩家
    private Position pos;
    //如果是假的话，则为非游戏状态
    private boolean isGaming;
    //玩家手牌
    private int[] handCard = new int[5];

    public Player(Position pos){
        setPos(pos);
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }


    public boolean isGaming() {
        return isGaming;
    }

    public void setGaming(boolean gaming) {
        isGaming = gaming;
    }

    public int[] getHandCard() {
        return handCard;
    }

    public void setHandCard(int[] handCard) {
        this.handCard = handCard;
    }

    @Override
    public String toString() {
        return "Player{" +
                "pos=" + pos +
                ", isGaming=" + isGaming +
                ", handCard=" + Arrays.toString(handCard) +
                '}';
    }
}
