 package inheritance.vehicle_registry;

 public class PaddleBoat extends Boat{
     public PaddleBoat(String ownerName, String address) {
       super(ownerName, address);
     }
    @Override
     public void accelerate(int rate){
         throw new RuntimeException("Can not accelerate");
         }
     @Override
     public void stop() {}
 }
