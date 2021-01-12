package scoping;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Bark");
        Dog d2 = new Dog("Ruff");
        Dog d3 = new Dog("Yep!!");

        d1.sound();
        d2.sound();
        d3.sound();
    }
}
