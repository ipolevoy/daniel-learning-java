package inheritance;

public class Main {

    public static void main(String[] args){


        Animal[] animals = new Animal[2];

        animals[0] =  new Dog("Sparky");
        animals[1] =  new Cat("Oliver");


        for(int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getName() + ":");
            animals[i].makeSound();

        }

    }

}
