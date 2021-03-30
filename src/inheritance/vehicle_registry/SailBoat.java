 package inheritance.vehicle_registry;
 
  public class SailBoat extends Boat{
      public SailBoat(String ownerName, String address) {
        super(ownerName, address);
      }
      @Override
      public void accelerate(int rate){
          throw new RuntimeException("Can not accelerate");
          }
      @Override
      public void stop() {}
 }
