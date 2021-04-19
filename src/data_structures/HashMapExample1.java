package data_structures;

import inheritance.vehicle_registry.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapExample1 {



    public static void main(String[] args) {

        Map<String, List<?>> vehicles = new HashMap<>();

        List<Car> cars = new ArrayList<>();
        cars.add(new PassengerCar("Igor", "123 Pine Street"));
        cars.add(new SportsCar("Dan", "456 Pine Street"));

        List<Boat> boats = new ArrayList<>();
        boats.add(new SailBoat("Igor", "123 Pine Street"));
        boats.add(new PaddleBoat("Dan", "456 Pine Street"));

        vehicles.put("cars", cars);
        vehicles.put("boats", boats);
        //...blah, blah...

        for(String key: vehicles.keySet()){
            System.out.println(key + " = " + vehicles.get(key));
        }

        List<Vehicle> mycars = (List<Vehicle>) vehicles.get("cars");
        for (Vehicle vehicle : mycars) {
            System.out.println("Car: " + vehicle);
        }
    }
}

/*
map
    "cars" -> List[ car, car]
    "boats" -> List[ boat, boat]
 */
