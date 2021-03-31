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

    public void accelerate(int rate){
        for (Vehicle vehicle : vehicles) {

            try{
                vehicle.accelerate(rate);
            }catch(Exception e){
                System.err.println(vehicle.getClass().getName() + " cannot accelerate at the rate of: " + rate);
            }
        }
    }
}
