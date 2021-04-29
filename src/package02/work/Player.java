package package02.work;

public class Player {
    private int points;

    @Override
    public String toString() {
        return "player{" +
                "points=" + points +
                '}';
    }

    public Player(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
