package operators;

public class EqualityOperator {

    public static void main(String[] args) {

        boolean x = true, y = false;

        System.out.println(!y); // true
        System.out.println(x != y); // true


        System.out.println(x && y); // false

        System.out.println(x || y); // true
    }
}
