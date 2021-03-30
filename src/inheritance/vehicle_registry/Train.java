package inheritance.vehicle_registry;

public class Train extends Vehicle{

    public Train(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {
		System.out.println("Accelerating...");
	}

    @Override
    public void decelerate(int rate) {}

    @Override
    public void stop() {}

    @java.lang.Override
    public RegistrationInfo getRegistrationInfo() {
        return new RegistrationInfo(getOwnerName(), getAddress());
    }
}
