package inheritance.vehicle_registry;

public abstract class Cycle extends Vehicle {

    public Cycle(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {}

    @Override
    public void decelerate(int rate) {}

    @Override
    void stop(); 
}