import static java.lang.Math.round;

public class Car_HW4 {
    private double tankVolume;
    private double tankBalance;
    private double fuelConsumption;

    public Car_HW4 (double tankVolume, double fuelConsumption, double tankBalance){
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.tankBalance = tankBalance;
    }

    public void fillTank() {
        System.out.println("Fuel added at patrol station: " + (tankVolume - getTankBalance()) + " liters");
        this.tankBalance += tankVolume - getTankBalance();
    }
    public double calculateTripCost(double distance, double price){
        return round(((fuelConsumption*(distance/100)))*price);
    }
    public void leftTankBalanceAtPoint(double distance) {
        double t = round(getTankBalance() - getFuelConsumption()*(distance/100));
        if(t<=0){
            System.out.println("Destination point unreachable! Please fill the tank or make stop between " + t + " liters");
            System.exit(-1);
        }else this.tankBalance = round(getTankBalance() - getFuelConsumption()*(distance/100));

    }
    public double getTankVolume() {
        return tankVolume;
    }

    public double getTankBalance() {
        return tankBalance;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public static void main(String[] args) {

        double distanceLake = 100.0;
        double distanceZhashkov = 200.0;
        double fullDistanceToKiev = 500;
        Car_HW4 car = new Car_HW4(50, 6, 10);
        System.out.println("Initial tank balance: " + car.getTankBalance());
        car.fillTank();
        System.out.println();
        //first point
        car.leftTankBalanceAtPoint(distanceLake);
        System.out.println("Tank balance at K.Lake: " + car.getTankBalance());
        car.fillTank();
        //second point
        car.leftTankBalanceAtPoint(distanceZhashkov);
        System.out.println("Tank balance at Zhashkov: " + car.getTankBalance());
        car.fillTank();
        //final point
        car.leftTankBalanceAtPoint(fullDistanceToKiev - distanceZhashkov - distanceLake);
        System.out.println("Tank balance: Kiev " + car.getTankBalance());
        System.out.println("Trip total cost: "+car.calculateTripCost(fullDistanceToKiev, 28) + " UAH");

    }
}
