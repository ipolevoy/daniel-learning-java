package looping;

public class ContinueOperator {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                continue; // circles back to top of loop
            }
            System.out.println(x);
        }

        System.out.println("======================");

        for (int x : numbers) {
            if (x == 30) {
                break; // breaks from the loop to a calling context
            }
            System.out.println(x);
        }

        System.out.println("Ze end!");
    }
}
