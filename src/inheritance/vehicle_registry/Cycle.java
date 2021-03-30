package inheritance.vehicle_registry;

public abstract class Cycle extends Vehicle {

    public Cycle(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) throws RuntimeException{}
 
		

    @Override
    public void decelerate(int rate) {}

    @Override
    public abstract void stop();

    @java.lang.Override
    public RegistrationInfo getRegistrationInfo() {
        return new RegistrationInfo(getOwnerName(), getAddress());
    }
}
