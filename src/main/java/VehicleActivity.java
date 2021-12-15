import java.util.ArrayList;

public class VehicleActivity {
    Road road;

    public VehicleActivity(Road road) {
        this.road = road;
    }

    public ArrayList<Vehicle> getTheThreeMostDistance(ArrayList<Vehicle> vehicles, int time) {
        ArrayList<Vehicle> theThreeMostDistance = new ArrayList<>();
        vehicles.sort((o1, o2) -> o1.compareDistance(o1, o2, time));
        for (int i = 0; i < vehicles.size() / 2; i++) {
            theThreeMostDistance.add(vehicles.get(i));
        }
        return theThreeMostDistance;
    }

    public ArrayList<Vehicle> getTheThreeMostFuelUsage(ArrayList<Vehicle> vehicles, double distance) {
        ArrayList<Vehicle> theThreeMostFuelUsage = new ArrayList<>();
        vehicles.sort((o1, o2) -> o1.compareFuelUsage(o1, o2, distance));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.fuelUsage(distance));
        }

        for (int i = vehicles.size()-1; i >  vehicles.size()-4 ; i--) {
            theThreeMostFuelUsage.add(vehicles.get(i));
        }
        System.out.println("\n");
        for (Vehicle vehicle : theThreeMostFuelUsage) {
            System.out.println(vehicle.fuelUsage(distance));
        }
        return theThreeMostFuelUsage;
    }
}
