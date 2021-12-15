public class Bus extends Vehicle {

    private int passengerCount;

    public Bus(int prodYear, double weight, double speed,
               double fuelPerKM, int passengerCount, Road road) {
        super(prodYear, weight, speed, fuelPerKM, road);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }


    @Override
    public double fuelUsage(double distance) {
        return super.fuelUsage(distance);
    }


    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return 0;
    }
}
