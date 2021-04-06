package exceptions;

/**
 * Example of "handling" a runtime exception and moving on.
 */
public class FooMainHello {
    public static void main(String[] args) {

        try{
            Foo.doSomething(0);
        }catch(ArithmeticException  e){
            //ignore
        }

        System.out.println("Hello");
    }
}
