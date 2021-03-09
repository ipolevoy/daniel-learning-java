package inheritance;

public abstract class Animal{

	private String name = "no name";

	public Animal(String name) {
		this.name = name;
	}

	public abstract void makeSound();

	public abstract Animal[] makeOffspring();

	public String getName() {
		return name;
	}
}
