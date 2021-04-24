package package02.abstractstudy;

public class AbstractTest02 {
    public static void main(String[] args) {
        SpeedMeter speedMeter = new CarSpeedMeter(12.2d);
        speedMeter.setTurnRate(1.1d);
        System.out.println(speedMeter.getSpeed());
    }
}
