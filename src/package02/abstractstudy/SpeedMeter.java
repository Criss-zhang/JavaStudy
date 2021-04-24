package package02.abstractstudy;

public abstract class SpeedMeter {
    private  double turnRate;

    public SpeedMeter(){}

    public void setTurnRate(double turnRate){
        this.turnRate = turnRate;
    }

    public abstract double calGirth();

    public double getSpeed(){
        return calGirth()*turnRate;
    }
}
