import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VehicleActivityTest {
    VehicleActivity vehicleActivity;

    @Before
    public void setUp() throws Exception {
        Road road1 = new Road(new Coordinates(45.3, 56.32), new Coordinates(46.3, 57.32), 43, 0.4);
        vehicleActivity = new VehicleActivity(road1);
    }

    @Test
    public void test1() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(6);

        double weight = 45.0;
        double speed = 72;
        double fuelPerKMBus = 5;
        double fuelPerKMTruck = 10;
        for (int i = 0; i < 3; i++) {
            vehicles.add(new Bus(1996, weight, speed, fuelPerKMBus, 12, vehicleActivity.road));
            weight++;
            speed++;
        }
        for (int j = 0; j < 3; j++) {
            vehicles.add(new Truck(1996, weight, speed, fuelPerKMTruck, 2, vehicleActivity.road));
            weight++;
            speed++;
        }
        ArrayList<Vehicle> theThreeMostDistanceTaken = new ArrayList<>();
        for (int i = 0; i < vehicles.size() / 2; i++) {
            theThreeMostDistanceTaken.add(vehicles.get(i));
        }
        ArrayList<Vehicle> theThreeMostFuelUsageTaken = new ArrayList<>();
        for (int j = vehicles.size() / 2; j < vehicles.size(); j++) {
            theThreeMostFuelUsageTaken.add(vehicles.get(j));
        }
       // vehicleActivity.getTheThreeMostFuelUsage(vehicles, (int) vehicleActivity.road.getDistance());
         assertEquals(theThreeMostDistanceTaken, vehicleActivity.getTheThreeMostDistance(vehicles, 60));
         assertEquals(theThreeMostFuelUsageTaken,vehicleActivity.getTheThreeMostFuelUsage(vehicles, (int) vehicleActivity.road.getDistance()));

    }
}