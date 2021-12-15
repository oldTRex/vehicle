public class Coordinates {

    private double x;
    private double y;
    private String locationName;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates(double x, double y, String locationName) {
        this.x = x;
        this.y = y;
        this.locationName = locationName;
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getLocationName() {
        return locationName;
    }

    public double distance(Coordinates other){

        return Math.sqrt((this.x-other.getX())*(this.x-other.getX())
                + (this.y-other.getY())*(this.y-other.getY()) );
    }

    public static double distance(Coordinates start, Coordinates end){
        return start.distance(end);
    }
}
