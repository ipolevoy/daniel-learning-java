package operators;

public class TernaryOperator {


    public static void main(String[] args) {
        String  message;
        int b;
        message = getMessage();

        /*
        if(a < 11){
            b = 3;
        }else {
            b = 12;
        }
         */

        b = message.equals("Hello") ? 3 : 12;
        System.out.println( "Value of b is : " +  b );
    }


    private static String getMessage(){
        return "Hello";
    }

}
