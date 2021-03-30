package inheritance.vehicle_registry;

public class Bicycle extends Cycle{
  public Bicycle(String ownerName, String address) {
  	super(ownerName, address);
  }
	@Override
    public void accelerate(int rate){
		throw new RuntimeException("Can not accelerate");
		}	
	@Override
	public void stop() {}	
}
