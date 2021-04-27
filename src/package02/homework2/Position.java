package package02.homework2;

/**
 * 这个类用于确定玩家方位
 */
public enum Position {
    First(1),SECOND(2),THIRD(3),FORTH(4),FIFTH(5);
    private int pos;
    private Position(int pos){
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}

