package inheritance.vehicle_registry;

public class SpeedTest {
	public static void main(String [] args) {
		Bicycle bike = new Bicycle("Daniel", "12 This Avenue");
		Unicycle uni = new Unicycle("Obama", "1 Biden Place");
		PassengerCar pcar = new PassengerCar("Car", "4 Wheel Drive");
		Jetski jet = new Jetski("Ski", "1 Jet Place");
		FreightTrain ft = new FreightTrain("Freight", "12 Freight Train");
		PaddleBoat paddle = new PaddleBoat("Pad", "1 Dull Boat");
		
		paddle.accelerate(10);
	}
} 
