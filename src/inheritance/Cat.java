package inheritance;

public class Cat extends Animal{


	public Cat(String name) {
		super(name);
	}

	public void makeSound(){
		System.out.println("Meow!!");
	}

	@Override
	public Animal[] makeOffspring() {

		Cat kitten1  =  new Cat("Ginger");
		Cat kitten2  =  new Cat("Puss in boots");

		Animal[] kittens = new Animal[2];

		kittens[0] = kitten1;
		kittens[1] = kitten2;
		return kittens;
	}
}
