package inheritance.vehicle_registry;

public class Bicycle extends Cycle {
    public Bicycle(String ownerName, String address) {
        super(ownerName, address);
    }

    @Override
    public void accelerate(int rate) {
        if(rate > 5) {
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
