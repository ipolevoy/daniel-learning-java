package exceptions;

/**
 * Example of getting hit in a face by a runtime exception
 */
public class FooMainBummer {
    public static void main(String[] args) {

        Foo.doSomething(0);

        System.out.println("Hello");
    }
}
