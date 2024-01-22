package midexam.four;

public class ElectricCar extends Vehicle {
    public static final double MAX_DISTANCE = 500;
    private double chargeLevel;

    public ElectricCar(double chargeLevel){
        super("Tesla", 0);
        this.chargeLevel = chargeLevel;
    }

    public double getchargeLevel(){
        return chargeLevel;
    }

    public void charge() {
        chargeLevel = 1.0;
    }

    public double getDistance(){
        return chargeLevel * MAX_DISTANCE;
    }

}
