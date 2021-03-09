package inheritance;

public class Main {

    public static void main(String[] args){


        Animal[] animals = new Animal[3];
        animals[0] =  new Dog("Sparky");
        animals[1] =  new Cat("Oliver");
        animals[2] =  new Herring("Fish 1");
        printAnimals(animals);
        makeOffspring(animals);
    }

    private static void makeOffspring(Animal[] animals) {

        for (Animal animal : animals) {
            Animal[]  offspring = animal.makeOffspring();
            System.out.println(animal.getName() + " made " + offspring.length + " children");
        }
    }

    public static void printAnimals(Animal[] animals){

        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}
