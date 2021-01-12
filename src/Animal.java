public class Animal {

	private String sound; 

	public Animal(String sound){
		this.sound = sound;
	}

	public static void main (String []args){

		Animal animal1 = new Animal("bark!");
		Animal animal2 = new Animal("meow!");

		animal1.makeSound();
		animal2.makeSound();


	}

	public void makeSound(){
		System.out.println(sound);
	}



}
