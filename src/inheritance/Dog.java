package inheritance;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	public void makeSound(){
		String x = "Bark!!!";
		System.out.println(x);
	}
}
