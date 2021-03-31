package inheritance.vehicle_registry;

public class SailBoat extends Boat {
    public SailBoat(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {

        if (rate > 10) {
            throw new RuntimeException("Can not accelerate");
        }
        super.accelerate(rate);
    }

    @Override
    public void stop() {
    }
}
