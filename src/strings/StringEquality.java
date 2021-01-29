package strings;

public class StringEquality {

    public static void main(String[] args) {

        //two different objects
        String x = new String("abc");
        String y = new String("abc");

        if(x.equals(y)) {
            System.out.println("equal"); // CORRECT
        }else {
            System.out.println("not equal");
        }

        if(x == y) { // compare value  of reference
            System.out.println("equal");
        }else {
            System.out.println("not equal"); // CORRECT
        }


        x = x.intern(); // loosing the original object, create a nee object on the pool
        y = y.intern(); // loosing the original object, gets a reference to existing object on the pool

        if(x == y) { // compare value  of reference
            System.out.println("equal"); // correct
        }else {
            System.out.println("not equal");
        }
    }
}
