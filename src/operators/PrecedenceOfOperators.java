package operators;

public class PrecedenceOfOperators {

    public static void main(String[] args) {

        int x = 2, y = 3;


        System.out.println(x + y + 4); // prints 9

        System.out.println(x + y * 4); // prints 14

        System.out.println((x + y) * 4); // prints 20
    }
}
