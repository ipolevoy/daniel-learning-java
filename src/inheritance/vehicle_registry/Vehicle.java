package inheritance.vehicle_registry;

public abstract class Vehicle implements Registerable{

    private String ownerName, address;

    public Vehicle(String ownerName, String address) {
        this.ownerName = ownerName;
        this.address = address;
    }

    public abstract void accelerate(int rate) throws RuntimeException;
    public abstract void decelerate(int rate);
    public abstract void stop();



    public String getOwnerName(){
        return ownerName;
    }

    public String getAddress(){
        return address;
    }


    @Override
    public String toString() {
        return "Type: " +   this.getClass().getSimpleName() + ", Owner: " + ownerName + ", address: " + address;
    }
}
