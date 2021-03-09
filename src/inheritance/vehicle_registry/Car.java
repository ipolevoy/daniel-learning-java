package inheritance.vehicle_registry;

public abstract class Car extends Vehicle{

    public Car(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {}

    @Override
    public void decelerate(int rate) {}

    @Override
    public abstract void stop();

}
