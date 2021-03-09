package inheritance.vehicle_registry;

public class Train extends Vehicle{

    public Train(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {}

    @Override
    public void decelerate(int rate) {}

    @Override
    public void stop() {}
}
