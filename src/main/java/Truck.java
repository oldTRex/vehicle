public class Truck extends Vehicle {

    private double loadWeight;

    public Truck(int prodYear, double weight, double speed,
                 double fuelPerKM, double loadWeight, Road road) {
        super(prodYear, weight, speed, fuelPerKM, road);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    @Override
    public double fuelUsage(double distance) {
        return super.fuelUsage(distance);
    }


    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return 1;
    }
}
