package inheritance.vehicle_registry;

public abstract class Cycle extends Vehicle {

    public Cycle(String ownerName, String address) {
        super(ownerName, address);
    }


    @java.lang.Override
    public RegistrationInfo getRegistrationInfo() {
        return new RegistrationInfo(getOwnerName(), getAddress());
    }
}
