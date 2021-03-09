package inheritance.vehicle_registry;

import java.util.ArrayList;
import java.util.List;

public class VehicleRegistry {

    List<Vehicle> vehicles = new ArrayList<>();

    public void register(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void list(){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

}
