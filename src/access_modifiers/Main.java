package access_modifiers;

public class Main {

    public static void main(String[] args) {
        Fruit f = new Fruit();
        System.out.println(f.getColor());

        /*
        f.weight = 3.2d; // will not compile because we are changing a final variable

        System.out.println(f.weight);

         */

    }
}
