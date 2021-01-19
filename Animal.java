class Animal{

    private String sound; 

	 public Animal(String sound){  // Constructor  - special method used to create instances of classes
	     	this.sound = sound;
	 } 
	        
   	 public void makeSound(){	// Standard instance method 
		System.out.println(sound);
	 }
	        
	 public static void main (String[] args){   // static method 
		Animal dog = new Animal("Bark!");
		dog.makeSound(); 
					  	
		Animal cat = new Animal("Meau!");
		cat.makeSound();

		Animal lion = new Animal("Roar!");
		lion.makeSound();

		Animal horse = new Animal("Neigh!");
		horse.makeSound();	
	} 
} 
 
