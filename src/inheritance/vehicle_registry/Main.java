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

        registry.list();
    }
}
