 package inheritance.vehicle_registry;
 
  public class Jetski extends Boat{
      public Jetski(String ownerName, String address) {
        super(ownerName, address);
      }
          
      @Override
      public void stop() {}
  }
