package operators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean x = true, y = false;

        if(x && y){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if(x || y){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        if( !(x || y)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
