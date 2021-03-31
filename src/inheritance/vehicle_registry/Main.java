package inheritance.vehicle_registry;

public class Main {

    public static void main(String[] args) {

        VehicleRegistry registry =  new VehicleRegistry();
        Sedan sedan = new Sedan("Igor", "123 Pine st");
        SportsCar sp = new SportsCar("Daniel", "456 Oak Street");
        FreightTrain ft = new FreightTrain("Amtrak", " 5667 Train street, NY NY");

        registry.register(sedan);
        registry.register(sp);
        registry.register(ft);

        registry.register(new Bicycle("Daniel", "12 This Avenue"));
        registry.register(new Unicycle("Obama", "1 Biden Place"));
        registry.register(new PassengerCar("Car", "4 Wheel Drive"));
        registry.register(new Jetski("Ski", "1 Jet Place"));
        registry.register(new FreightTrain("Freight", "12 Freight Train"));
        registry.register(new PaddleBoat("Pad", "1 Dull Boat"));



        registry.accelerate(4);
    }
}
