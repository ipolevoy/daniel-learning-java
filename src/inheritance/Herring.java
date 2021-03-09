package inheritance;

import java.util.ArrayList;

public class Herring extends Animal{

    public Herring(String name) {
        super(name);
    }

    @Override
    public void makeSound() {}

    @Override
    public Animal[] makeOffspring() {

        Animal[] fish = new Animal[1000];
        for(int x = 0; x < 1000; x++){
            fish[x] = new Herring("" + x);
        }
        return fish;
    }
}
