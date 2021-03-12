package inheritance.vehicle_registry;

public class RegistrationInfo {
    private String name, address;

    public RegistrationInfo(java.lang.String name, java.lang.String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
