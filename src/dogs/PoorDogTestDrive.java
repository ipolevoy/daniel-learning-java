public class PoorDogTestDrive {
        public static void main (String[] args) {
                PoorDog one = new PoorDog();
                System.out.println("Dog size is " + one.getSize());
                System.out.println("Dog name is " + one.getName());

		one.setSize(75);
		System.out.println("Dog size through set is " + one.getSize());

        }	
}

