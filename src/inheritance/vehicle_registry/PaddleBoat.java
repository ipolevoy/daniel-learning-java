package inheritance.vehicle_registry;

public class PaddleBoat extends Boat {
    public PaddleBoat(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {
        if (rate > 3) {
            throw new RuntimeException("Can not accelerate");
        }
        super.accelerate(rate);
    }

    @Override
    public void stop() {
    }
}
