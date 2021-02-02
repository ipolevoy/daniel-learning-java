package methods;

public class ExampleOverloading {

    public static void main(String[] args){
        minFunction(1, 2, 3, 4, 5, 6, 10, 50); // syntactical sugar - new slang!
    }

    // for integer
    public static int minFunction(int n1, int n2) { ///  ONLY method name and arguments make up a signature
        return 0;
    }

    // for double
    public static int minFunction(int ... n1) {

        for (int j : n1) {
            System.out.println(j);
        }
        return 1;
    }
}
