package looping;

public class DoWhileLoop {

    public static void main(String[] args) {

        int x = 10;
        //executes the body of a loop first, then checks for condition
        do{
            System.out.println(x);
            x--;
        }while (x > -1);
    }
}
