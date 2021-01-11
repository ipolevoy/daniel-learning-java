class GoodDogTestDrive {
	
	public static void main (String[] args) {
		
		GoodDog one = new GoodDog();
		one.setSize(70);
		
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("Dog one: " + one.getSize());
		System.out.println("Dog two: " + two.getSize());
		
		one.bark();
		two.bark();

		GoodDog three = new GoodDog(100,150,120);
		System.out.println("Dog two get: " + two.getSize());

		System.out.println("Dog three get: " + three.getSize());
		three.tailLength = 355.22; // public variable (accessed from GoodDog)
		System.out.println("Public variable decimal " + (three.tailLength + 25.76));
		three.bark();

			
	}	
}
