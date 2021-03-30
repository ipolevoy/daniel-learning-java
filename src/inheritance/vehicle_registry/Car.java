package inheritance.vehicle_registry;

public abstract class Car extends Vehicle{

    public Car(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {
		System.out.println("Accelerating...");
	} 

    @Override
    public void decelerate(int rate) {}

    @Override
    public abstract void stop();


    public RegistrationInfo getRegistrationInfo() {
        return new RegistrationInfo(getOwnerName(), getAddress());
    }
}
