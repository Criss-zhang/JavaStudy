package package02.abstractstudy;

public class CarSpeedMeter extends SpeedMeter {
    private double radius;

    public CarSpeedMeter(double radius){
        this.radius = radius;
    }

    @Override
    public double calGirth() {
        return radius *Math.PI*2;
    }
}
