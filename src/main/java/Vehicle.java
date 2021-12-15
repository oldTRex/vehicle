import java.util.Comparator;

public abstract class Vehicle implements Movable, FuelConsumer, Comparator<Vehicle> {

    private int prodYear;
    private double weight;
    private double speed;
    private double fuelPerKM;
    private Road road;


    public Vehicle(int prodYear, double weight, double speed,
                   double fuelPerKM, Road road) {
        this.prodYear = prodYear;
        this.weight = weight;
        this.speed = speed;
        this.fuelPerKM = fuelPerKM;
        this.road = road;
    }

    public int getProdYear() {
        return prodYear;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuelPerKM() {
        return fuelPerKM;
    }

    public Road getRoad() {
        return road;
    }

    @Override
    public double move(int time) {
        return time * speed;
    }

    @Override
    public double fuelUsage(double distance) {

        double roadTempCoef =(double) (100 + 25 - road.getTemperature()) / 100;
        double roadQualityCoef = 1 - road.getQuality();

        return distance * fuelPerKM * roadQualityCoef * roadTempCoef;
    }

    // to compare

    public int compareDistance(Vehicle o1, Vehicle o2, int time) {
        return Integer.compare((int) o1.move(time), (int) o2.move(time));
    }

    public int compareFuelUsage(Vehicle o1, Vehicle o2, double distance) {
        return Integer.compare((int) o1.fuelUsage(distance), (int) o2.fuelUsage(distance));
    }

}
