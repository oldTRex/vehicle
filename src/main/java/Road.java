public class Road {

    private Coordinates start;
    private Coordinates destination;
    private int temperature;
    private double quality;
    private double distance;


    public Road(Coordinates start, Coordinates destination, int temperature, double quality) {
        this.start = start;
        this.destination = destination;
        this.temperature = temperature;
        this.quality = quality;
    }

    public Coordinates getStart() {
        return start;
    }

    public Coordinates getDestination() {
        return destination;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getQuality() {
        return quality;
    }

    public double getDistance( ) {
        return start.distance(destination);
    }
}
