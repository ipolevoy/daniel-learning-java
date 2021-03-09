package inheritance.vehicle_registry;

public class PassengerCar extends Car{

    public PassengerCar(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void stop() {
    }
}
