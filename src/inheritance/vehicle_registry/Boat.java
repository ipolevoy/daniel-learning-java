package inheritance.vehicle_registry;
 
  public abstract class Boat extends Vehicle{
 
      public Boat(String ownerName, String address) {
          super(ownerName, address);
      }
 

 
      @Override
      public void decelerate(int rate) {}
 
      @Override
      public abstract void stop();

 
      public RegistrationInfo getRegistrationInfo() {
          return new RegistrationInfo(getOwnerName(), getAddress());
      }
  }
