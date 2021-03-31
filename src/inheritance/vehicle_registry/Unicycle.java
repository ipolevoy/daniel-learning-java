package inheritance.vehicle_registry;

public class Unicycle extends Cycle {
    public Unicycle(String ownerName, String address) {
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
    public void decelerate(int rate) {
    }

    @Override
    public void stop() {
    }
}
