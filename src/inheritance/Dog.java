package inheritance;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	public void makeSound(){
		String x = "Bark!!!";
		System.out.println(x);
	}

	@Override
	public Animal[] makeOffspring() {
		Dog dog1 =  new Dog("Barker");
		Dog dog2 =  new Dog("Coco");
		Animal[] puppies = new Animal[2];
		puppies[0] = dog1;
		puppies[1] = dog2;
		return puppies;
	}
}
